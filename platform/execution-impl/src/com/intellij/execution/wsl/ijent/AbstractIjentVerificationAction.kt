// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
@file:Suppress("DialogTitleCapitalization", "HardCodedStringLiteral")
package com.intellij.execution.wsl.ijent

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.EDT
import com.intellij.openapi.application.ModalityState
import com.intellij.openapi.application.asContextElement
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.diagnostic.runAndLogException
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages
import com.intellij.platform.ide.progress.ModalTaskOwner
import com.intellij.platform.ide.progress.TaskCancellation
import com.intellij.platform.ide.progress.withModalProgress
import com.intellij.platform.ijent.IjentApi
import com.intellij.platform.ijent.IjentExecApi
import com.intellij.platform.ijent.IjentMissingBinary
import com.intellij.platform.ijent.executeProcess
import com.intellij.platform.ijent.fs.nio.asNioFileSystem
import com.intellij.platform.util.coroutines.childScope
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.consumeEach
import org.jetbrains.annotations.ApiStatus.Internal
import java.io.ByteArrayOutputStream
import kotlin.io.path.isDirectory

/**
 * Base class for internal smoke testing of IJent.
 * It was deliberately put into the core part, near WSL utilities, in order to be sure that IJent can be integrated into WSL support.
 */
@Internal
abstract class AbstractIjentVerificationAction : DumbAwareAction() {
  override fun getActionUpdateThread(): ActionUpdateThread = ActionUpdateThread.BGT

  override fun update(e: AnActionEvent) {
    super.update(e)
    e.presentation.run {
      isEnabledAndVisible = ApplicationManager.getApplication().isInternal
      description = "An internal action for verifiying correct module layout for IJent"
    }
  }

  @OptIn(DelicateCoroutinesApi::class)  // Doesn't matter for a trivial test utility.
  override fun actionPerformed(e: AnActionEvent) {
    val modalTaskOwner =
      e.project?.let(ModalTaskOwner::project)
      ?: PlatformDataKeys.CONTEXT_COMPONENT.getData(e.dataContext)?.let(
        ModalTaskOwner::component)
      ?: error("No ModalTaskOwner")
    GlobalScope.launch {
      LOG.runAndLogException {
        try {
          withModalProgress(modalTaskOwner, e.presentation.text, TaskCancellation.cancellable()) {
            coroutineScope {
              val (ijent, title) = launchIjent(childScope())

              coroutineScope {
                launch {
                  val process = when (val p = ijent.exec.executeProcess("uname", "-a")) {
                    is IjentExecApi.ExecuteProcessResult.Failure -> error(p)
                    is IjentExecApi.ExecuteProcessResult.Success -> p.process
                  }
                  val stdout = ByteArrayOutputStream()
                  process.stdout.consumeEach(stdout::write)
                  withContext(Dispatchers.EDT + ModalityState.any().asContextElement()) {
                    Messages.showInfoMessage(stdout.toString(), title)
                  }
                }

                launch(Dispatchers.IO) {
                  val nioFs = ijent.fs.asNioFileSystem()
                  val path = "/etc"
                  val isDir = nioFs.getPath(path).isDirectory()
                  withContext(Dispatchers.EDT + ModalityState.any().asContextElement()) {
                    Messages.showInfoMessage("$path is directory: $isDir", title)
                  }
                }
              }
              coroutineContext.cancelChildren()
            }
          }
        }
        catch (err: IjentMissingBinary) {
          GlobalScope.launch(Dispatchers.EDT + ModalityState.any().asContextElement()) {
            Messages.showErrorDialog(err.localizedMessage, "IJent error")
          }
        }
      }
    }
  }

  protected abstract suspend fun launchIjent(childScope: CoroutineScope): Pair<IjentApi, String>

  companion object {
    protected val LOG = logger<AbstractIjentVerificationAction>()
  }
}