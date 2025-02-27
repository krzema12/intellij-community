// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.jetbrains.kotlin.idea.k2.refactoring.bindToElement;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.base.test.TestRoot;
import org.junit.runner.RunWith;

/**
 * This class is generated by {@link org.jetbrains.kotlin.testGenerator.generator.TestGenerator}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("refactorings/kotlin.refactorings.tests.k2")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("../../idea/tests/testData/refactoring/bindToElement")
public abstract class K2BindToElementTestGenerated extends AbstractK2BindToElementTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/annotationCall")
    public static class AnnotationCall extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationCall/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationCall/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationCall/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/annotationReference")
    public static class AnnotationReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/annotationReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/callOnCompanionObject")
    public static class CallOnCompanionObject extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnCompanionObject/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnCompanionObject/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnCompanionObject/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/callOnObject")
    public static class CallOnObject extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnObject/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnObject/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callOnObject/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/callableReference")
    public static class CallableReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callableReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callableReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/callableReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/changeImport")
    public static class ChangeImport extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("ChangeImport.kt")
        public void testChangeImport() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/changeImport/ChangeImport.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/constructorCall")
    public static class ConstructorCall extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/constructorCall/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/constructorCall/RootPkg.kt");
        }

        @TestMetadata("TypeArgument.kt")
        public void testTypeArgument() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/constructorCall/TypeArgument.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/constructorCall/UnQualified.kt");
        }

        @TestMetadata("UnQualifiedInCallChain.kt")
        public void testUnQualifiedInCallChain() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/constructorCall/UnQualifiedInCallChain.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/delegatedSuperTypeReference")
    public static class DelegatedSuperTypeReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/delegatedSuperTypeReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/delegatedSuperTypeReference/RootPkg.kt");
        }

        @TestMetadata("Unqualified.kt")
        public void testUnqualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/delegatedSuperTypeReference/Unqualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/docReference")
    public static class DocReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/docReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/docReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/docReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/importReference")
    public static class ImportReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("ImportReference.kt")
        public void testImportReference() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/importReference/ImportReference.kt");
        }

        @TestMetadata("ImportReferenceWithAlias.kt")
        public void testImportReferenceWithAlias() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/importReference/ImportReferenceWithAlias.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/objectProperty")
    public static class ObjectProperty extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/objectProperty/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/objectProperty/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/objectProperty/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference")
    public static class PropertyTypeReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference/FullyQualified.kt");
        }

        @TestMetadata("FullyQualifiedWithLongerFqn.kt")
        public void testFullyQualifiedWithLongerFqn() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference/FullyQualifiedWithLongerFqn.kt");
        }

        @TestMetadata("FullyQualifiedWithShorterFqn.kt")
        public void testFullyQualifiedWithShorterFqn() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference/FullyQualifiedWithShorterFqn.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/propertyTypeReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/returnTypeReference")
    public static class ReturnTypeReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/returnTypeReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/returnTypeReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/returnTypeReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/superTypeCall")
    public static class SuperTypeCall extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeCall/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeCall/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeCall/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/superTypeReference")
    public static class SuperTypeReference extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeReference/FullyQualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeReference/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/superTypeReference/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/topLevelFunctionCall")
    public static class TopLevelFunctionCall extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("Qualified.kt")
        public void testQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelFunctionCall/Qualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelFunctionCall/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelFunctionCall/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/topLevelProperty")
    public static class TopLevelProperty extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("Qualified.kt")
        public void testQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelProperty/Qualified.kt");
        }

        @TestMetadata("RootPkg.kt")
        public void testRootPkg() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelProperty/RootPkg.kt");
        }

        @TestMetadata("UnQualified.kt")
        public void testUnQualified() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/topLevelProperty/UnQualified.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../../idea/tests/testData/refactoring/bindToElement/typeArgs")
    public static class TypeArgs extends AbstractK2BindToElementTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("AllTypeArguments.kt")
        public void testAllTypeArguments() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/typeArgs/AllTypeArguments.kt");
        }

        @TestMetadata("FirstLastTypeArguments.kt")
        public void testFirstLastTypeArguments() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/typeArgs/FirstLastTypeArguments.kt");
        }

        @TestMetadata("SingleRef.kt")
        public void testSingleRef() throws Exception {
            runTest("../../idea/tests/testData/refactoring/bindToElement/typeArgs/SingleRef.kt");
        }
    }
}
