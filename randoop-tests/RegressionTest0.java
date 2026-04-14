import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.Class<?> wildcardClass1 = weightHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        WeightHelper weightHelper0 = new WeightHelper();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = weightHelper0.calculateBMI((double) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        WeightHelper weightHelper0 = new WeightHelper();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = weightHelper0.calculateBMI(1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory(0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((-1.0d), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI(520000.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI(5199.999999999999d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory((-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((double) (-1L), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weightHelper0.getCategory((double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory((double) 10.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory(0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) 0.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        WeightHelper weightHelper0 = new WeightHelper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = weightHelper0.getCategory(0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) ' ', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((double) (-1.0f), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory((double) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) (byte) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) (byte) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((double) (-1.0f), 5199.999999999999d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        double double6 = weightHelper0.calculateBMI((double) 100L, (double) (short) 10);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory((double) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) '4', 9999.999999999998d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 36982.24852071005d + "'", double9 == 36982.24852071005d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory((double) 100L, 36982.248520710054d);
        double double12 = weightHelper0.calculateBMI(9999.999999999998d, 36982.248520710054d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.698224852071007d + "'", double12 == 3.698224852071007d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory((double) 100L, 36982.248520710054d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        double double12 = weightHelper0.calculateBMI(10000.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-4d + "'", double12 == 1.0E-4d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI(36982.24852071005d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI(1.0E8d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI(3.7198427037942397E-7d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-12d + "'", double9 == 1.0E-12d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory(10000.0d, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = weightHelper0.calculateBMI((double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory(10000.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI(1.0E8d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory(36982.248520710054d, (double) '4');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI((double) 10, (double) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3199.9999999999995d + "'", double9 == 3199.9999999999995d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory(10000.0d, (double) (short) 1);
        java.lang.String str15 = weightHelper0.getCategory((double) '#', (double) (byte) 100);
        double double18 = weightHelper0.calculateBMI(36982.248520710054d, (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        double double12 = weightHelper0.calculateBMI(10000.0d, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = weightHelper0.calculateBMI((double) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-4d + "'", double12 == 1.0E-4d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        double double9 = weightHelper0.calculateBMI(1.0d, (double) 1);
        double double12 = weightHelper0.calculateBMI((double) (short) 100, 100.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI(0.0035000000000000014d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) 100L, 32.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI((double) 10.0f, 1.0E-4d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.009999999999999998d + "'", double15 == 0.009999999999999998d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) ' ', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = weightHelper0.calculateBMI(32.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI(1.0E8d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-12d + "'", double15 == 1.0E-12d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) 0.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI((double) 1, (double) 'a');
        java.lang.String str18 = weightHelper0.getCategory((double) (byte) 10, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = weightHelper0.getCategory((double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 970000.0d + "'", double15 == 970000.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        double double15 = weightHelper0.calculateBMI((double) 100, (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory(0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        WeightHelper weightHelper0 = new WeightHelper();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = weightHelper0.calculateBMI((-1.0d), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) 100L, 3.5872781065088757E-6d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(36982.24852071005d, 10.0d);
        double double12 = weightHelper0.calculateBMI((double) 10, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = weightHelper0.getCategory((double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        double double6 = weightHelper0.calculateBMI((double) 100L, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory((-1.0d), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI(1.0E8d, (double) (byte) 1);
        java.lang.String str18 = weightHelper0.getCategory((double) 100, (double) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-12d + "'", double15 == 1.0E-12d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 100, 9999.999999999998d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI((double) (byte) -1, 970000.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9999.999999999998d + "'", double9 == 9999.999999999998d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        java.lang.String str12 = weightHelper0.getCategory(0.009999999999999998d, (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory((double) 100L, 36982.248520710054d);
        java.lang.String str12 = weightHelper0.getCategory((double) 1L, 999999.9999999997d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = weightHelper0.calculateBMI((double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory(10000.0d, (double) (short) 1);
        double double15 = weightHelper0.calculateBMI((double) 100L, 0.009999999999999998d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.009999999999999998d + "'", double15 == 0.009999999999999998d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) ' ', (double) 0L);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(36982.24852071005d, 10.0d);
        double double12 = weightHelper0.calculateBMI((double) 10, (double) (short) 0);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI((double) 100L, 970000.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 970000.0d + "'", double9 == 970000.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI(0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI(9999.999999999998d, (double) '#');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0035000000000000014d + "'", double9 == 0.0035000000000000014d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10.0f, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((double) 0.0f, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory((double) (short) 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = weightHelper0.calculateBMI((double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weightHelper0.getCategory(0.0d, 36982.248520710054d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        java.lang.String str15 = weightHelper0.getCategory(1.0E-4d, (double) 100L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        double double9 = weightHelper0.calculateBMI(36982.248520710054d, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory((double) (short) 100, (double) 100L);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) 1L, 36982.248520710054d);
        java.lang.String str15 = weightHelper0.getCategory(520000.0d, 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.698224852071005E8d + "'", double12 == 3.698224852071005E8d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) '4', 9999.999999999998d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 36982.24852071005d + "'", double9 == 36982.24852071005d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        double double9 = weightHelper0.calculateBMI(36982.248520710054d, 0.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI(1.0E8d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI((double) (short) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-12d + "'", double9 == 1.0E-12d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        WeightHelper weightHelper0 = new WeightHelper();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = weightHelper0.calculateBMI((double) 0L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = weightHelper0.getCategory(1.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 100, 9999.999999999998d);
        double double12 = weightHelper0.calculateBMI(0.0035000000000000014d, (double) ' ');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9999.999999999998d + "'", double9 == 9999.999999999998d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.612244897959182E10d + "'", double12 == 2.612244897959182E10d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) 100L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI(0.0035000000000000014d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Weight must be greater than zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory(10000.0d, (double) (short) 1);
        java.lang.String str15 = weightHelper0.getCategory((double) '#', (double) (byte) 100);
        java.lang.String str18 = weightHelper0.getCategory(1.0d, 520000.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI((double) 1L, 0.0d);
        java.lang.String str12 = weightHelper0.getCategory((double) (short) 100, (double) ' ');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory(3.7198427037942397E-7d, 3698224.852071005d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI((double) (-1L), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI(999999.9999999997d, 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, 1.0E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        double double12 = weightHelper0.calculateBMI(10000.0d, (double) (short) 1);
        java.lang.String str15 = weightHelper0.getCategory((double) (byte) 1, 100.0d);
        java.lang.String str18 = weightHelper0.getCategory((double) 1, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = weightHelper0.getCategory((double) (-1L), 1.0E-12d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-4d + "'", double12 == 1.0E-4d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI(9999.999999999998d, (double) '#');
        double double12 = weightHelper0.calculateBMI((double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0035000000000000014d + "'", double9 == 0.0035000000000000014d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) ' ', (double) 0L);
        double double15 = weightHelper0.calculateBMI(32.0d, 1.0E-12d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.765624999999999E-12d + "'", double15 == 9.765624999999999E-12d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI((double) (short) 1, (double) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100000.0d + "'", double9 == 100000.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        java.lang.String str15 = weightHelper0.getCategory(1.0E-4d, (double) 100L);
        java.lang.String str18 = weightHelper0.getCategory((double) ' ', (double) 10);
        java.lang.String str21 = weightHelper0.getCategory(2.612244897959182E10d, 3698224.852071005d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        java.lang.String str9 = weightHelper0.getCategory(10000.0d, 1.0E8d);
        double double12 = weightHelper0.calculateBMI((double) 100, 36982.248520710054d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(36982.24852071005d, (double) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Underweight" + "'", str3, "Underweight");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI((double) 1, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = weightHelper0.getCategory(0.0d, 999999.9999999997d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 970000.0d + "'", double15 == 970000.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI((double) '4', 10000.0d);
        double double15 = weightHelper0.calculateBMI((double) 1, (double) 'a');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 970000.0d + "'", double15 == 970000.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) ' ', (double) 0L);
        double double15 = weightHelper0.calculateBMI((double) 10, 9999.999999999998d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = weightHelper0.getCategory((double) 0.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 999999.9999999997d + "'", double15 == 999999.9999999997d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, 970000.0d);
        double double9 = weightHelper0.calculateBMI((double) 100, 10000.0d);
        java.lang.String str12 = weightHelper0.getCategory((double) (short) 10, (double) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        java.lang.String str15 = weightHelper0.getCategory(9999.999999999998d, (double) (short) 100);
        java.lang.String str18 = weightHelper0.getCategory(36982.24852071005d, (double) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Underweight" + "'", str18, "Underweight");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        java.lang.String str15 = weightHelper0.getCategory(9999.999999999998d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = weightHelper0.calculateBMI((double) 0.0f, 5199.999999999999d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = weightHelper0.calculateBMI((double) (short) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) 1L, 1.0d);
        double double12 = weightHelper0.calculateBMI((double) 100.0f, 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory(970000.0d, (double) 10.0f);
        double double9 = weightHelper0.calculateBMI(10000.0d, 0.009999999999999998d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.999999999999997E-7d + "'", double9 == 9.999999999999997E-7d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory((double) 100L, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        double double12 = weightHelper0.calculateBMI((double) ' ', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = weightHelper0.calculateBMI((double) (-1.0f), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory(999999.9999999997d, 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        java.lang.String str12 = weightHelper0.getCategory(36982.24852071005d, 3199.9999999999995d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory((double) 100L, 36982.248520710054d);
        double double12 = weightHelper0.calculateBMI((double) 10, 36982.248520710054d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3698224.852071005d + "'", double12 == 3698224.852071005d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) ' ');
        java.lang.String str12 = weightHelper0.getCategory(3.698224852071007d, (double) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        double double9 = weightHelper0.calculateBMI(1.0d, (double) 1);
        java.lang.String str12 = weightHelper0.getCategory(32.0d, 10000.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10000.0d + "'", double9 == 10000.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = weightHelper0.calculateBMI((-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) (short) 1, 10000.0d);
        java.lang.String str9 = weightHelper0.getCategory(3.7198427037942397E-7d, 3698224.852071005d);
        double double12 = weightHelper0.calculateBMI(1.0d, 999999.9999999997d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E8d + "'", double6 == 1.0E8d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.999999999999996E9d + "'", double12 == 9.999999999999996E9d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.getCategory(10.0d, (double) 0);
        double double12 = weightHelper0.calculateBMI(2.612244897959182E10d, (double) 100L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.465454101562502E-15d + "'", double12 == 1.465454101562502E-15d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI(9999.999999999998d, (double) '#');
        java.lang.String str12 = weightHelper0.getCategory(0.009999999999999998d, (double) 0.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0035000000000000014d + "'", double9 == 0.0035000000000000014d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        double double6 = weightHelper0.calculateBMI((double) 10.0f, (double) '4');
        double double9 = weightHelper0.calculateBMI(520000.0d, (double) 'a');
        double double12 = weightHelper0.calculateBMI(970000.0d, (double) '#');
        java.lang.String str15 = weightHelper0.getCategory(970000.0d, (double) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5199.999999999999d + "'", double6 == 5199.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5872781065088757E-6d + "'", double9 == 3.5872781065088757E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7198427037942397E-7d + "'", double12 == 3.7198427037942397E-7d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(36982.24852071005d, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        double double9 = weightHelper0.calculateBMI((double) (byte) 10, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(970000.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory(1.0d, 1.0d);
        java.lang.String str6 = weightHelper0.getCategory((double) (short) 1, (double) 10L);
        double double9 = weightHelper0.calculateBMI(9999.999999999998d, (double) '#');
        java.lang.String str12 = weightHelper0.getCategory(0.009999999999999998d, (double) 0.0f);
        double double15 = weightHelper0.calculateBMI(1.0E-4d, (double) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Obese" + "'", str6, "Obese");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0035000000000000014d + "'", double9 == 0.0035000000000000014d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.5E13d + "'", double15 == 3.5E13d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        java.lang.String str9 = weightHelper0.getCategory(10000.0d, 1.0E8d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = weightHelper0.getCategory((double) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Height must be greater than or equal to zero, got: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI((double) 10L, (double) (short) 0);
        java.lang.String str9 = weightHelper0.getCategory(10000.0d, 1.0E8d);
        double double12 = weightHelper0.calculateBMI((double) 100, 36982.248520710054d);
        java.lang.String str15 = weightHelper0.getCategory((double) 1.0f, (double) 0.0f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36982.248520710054d + "'", double12 == 36982.248520710054d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory((double) (byte) 1, 3.698224852071005E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        WeightHelper weightHelper0 = new WeightHelper();
        double double3 = weightHelper0.calculateBMI((double) 1, (double) '4');
        java.lang.String str6 = weightHelper0.getCategory(9999.999999999998d, (double) 10L);
        java.lang.String str9 = weightHelper0.getCategory(36982.248520710054d, (double) '4');
        double double12 = weightHelper0.calculateBMI((double) 1L, 1.0E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520000.0d + "'", double3 == 520000.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        WeightHelper weightHelper0 = new WeightHelper();
        java.lang.String str3 = weightHelper0.getCategory((double) 10, (double) 'a');
        double double6 = weightHelper0.calculateBMI(10.0d, (double) (byte) 100);
        java.lang.String str9 = weightHelper0.getCategory(36982.24852071005d, 10.0d);
        java.lang.String str12 = weightHelper0.getCategory(3.698224852071007d, (double) 1L);
        double double15 = weightHelper0.calculateBMI((double) '#', 10000.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Obese" + "'", str3, "Obese");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9999.999999999998d + "'", double6 == 9999.999999999998d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 81632.6530612245d + "'", double15 == 81632.6530612245d);
    }
}

