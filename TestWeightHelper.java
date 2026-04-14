import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TestWeightHelper
 *
 * EQUIVALENCE PARTITIONS
 * ----------------------
 *  Height input:
 *    EP1 (invalid) : height <= 0
 *    EP2 (valid)   : height > 0
 *
 *  Weight input:
 *    EP3 (invalid) : weight < 0
 *    EP4 (valid)   : weight >= 0 
 *
 *  BMI result:
 *    EP5 : BMI < 18.5         --> "Underweight"
 *    EP6 : 18.5 <= BMI < 25   --> "Normal weight"
 *    EP7 : 25   <= BMI < 30   --> "Overweight"
 *    EP8 : BMI >= 30          --> "Obese"
 *
 * 
 * BOUNDARY VALUES
 * ----------------------
 *  Height:   0 (invalid), 0.01 (minimum valid), typical 170
 *  Weight:   -0.01 (just below boundary), 0 (valid), 0.01 (just above boundary), 70 (typical)
 *  BMI boundaries: 18.5, 25.0, 30.0
 */
public class TestWeightHelper {
    private WeightHelper helper;

    @BeforeEach
    void setUp() {
        helper = new WeightHelper();
    }

    //*** calculateBMI: invalid inputs

    //EP1 - zero height is invalid
    @Test
    void testCalculateBMI_zeroHeight_throwsException() {
        assertThrows(IllegalArgumentException.class,
            () -> helper.calculateBMI(0, 70));
    }

    //EP1 – negative height is invalid
    @Test
    void testCalculateBMI_negativeHeight_throwsException() {
        assertThrows(IllegalArgumentException.class,
            () -> helper.calculateBMI(-10, 70));
    }

    //EP3 - negative weight is invalid
    @Test
    void testCalculateBMI_negativeWeight_throwsException() {
        assertThrows(IllegalArgumentException.class,
            () -> helper.calculateBMI(170, -1));
    }


    //*** calculateBMI: valid inputs

    //EP2 & EP4 - zero weight is valid; BMI should be 0.0
    @Test
    void testCalculateBMI_zeroWeight_returnsZero() {
        double bmi = helper.calculateBMI(170, 0);
        assertEquals(0.0, bmi, 0.0001);
    }

    //EP2 & EP4 - typical person values; 175cm and 70kg --> BMI: 22.857
    @Test
    void testCalculateBMI_typicalValues_correctResult() {
        double bmi = helper.calculateBMI(175, 70);
        assertEquals(22.857, bmi, 0.001);
    }

    //EP2 - minimum valid height and weight
    @Test
    void testCalculateBMI_minimumHeight_doesNotThrow() {
        assertDoesNotThrow(() -> helper.calculateBMI(0.001, 0.001));
    }

    //EP2 & EP4 - large values do not throw error
    @Test
    void testCalculateBMI_largeValues_doesNotThrow() {
        assertDoesNotThrow(() -> helper.calculateBMI(250, 300));
    }


    //*** calculateBMI: boundary values

    //EP5 - BMI boundary under 18.5; 170cm and 53.462kg --> BMI: 18.499
    @Test
    void testCalculateBMI_justBelowUnderweightBoundary() {
        double bmi = helper.calculateBMI(170, 53.462);
        assertTrue(bmi < 18.5, "Expected BMI < 18.5 but got " + bmi);
    }

    //EP6 - BMI exactly at 18.5; 170cm and 53.465kg --> BMI: 18.5
    @Test
    void testCalculateBMI_exactlyAtUnderweightBoundary() {
        double bmi = helper.calculateBMI(170, 53.465);
        assertEquals(18.5, bmi, 0.01);
    }

    //EP7 - BMI exactly at 25.0; 170cm and 72.25kg --> BMI: 25.0
    @Test
    void testCalculateBMI_exactlyAtNormalBoundary() {
        double bmi = helper.calculateBMI(170, 72.25);
        assertEquals(25.0, bmi, 0.01);
    }
    
    //EP8 - BMI exactly at 30.0; 170cm and 86.7kg --> BMI: 30.0
    @Test
    void testCalculateBMI_exactlyAtOverweightBoundary() {
        double bmi = helper.calculateBMI(170, 86.7);
        assertEquals(30.0, bmi, 0.01);
    }


    //*** getCategory: invalid inputs

    //EP1 - zero height excepton propagates through to getCategory function
    @Test
    void testGetCategory_zeroHeight_throwsException() {
        assertThrows(IllegalArgumentException.class,
            () -> helper.getCategory(0, 70));
    }

    //EP3 - negative weight excepton propagates through to getCategory function
    @Test
    void testGetCategory_negativeWeight_throwsException() {
        assertThrows(IllegalArgumentException.class,
            () -> helper.getCategory(170, -5));
    }


    //*** getCategory: valid representative inputs

    //EP5 – typical underweight: 170cm and 50 kg --> BMI: 17.3
    @Test
    void testGetCategory_underweight_typical() {
        assertEquals("Underweight", helper.getCategory(170, 50));
    }

    //EP6 – typical normal weight: 175cm and 70kg --> BMI: 22.9
    @Test
    void testGetCategory_normalWeight_typical() {
        assertEquals("Normal weight", helper.getCategory(175, 70));
    }

    //EP7 – typical overweight: 170cm and 80kg --> BMI: 27.7
    @Test
    void testGetCategory_overweight_typical() {
        assertEquals("Overweight", helper.getCategory(170, 80));
    }

    //EP8 – typical obese: 170cm and 100kg --> BMI: 34.6
    @Test
    void testGetCategory_obese_typical() {
        assertEquals("Obese", helper.getCategory(170, 100));
    }


    //*** getCategory: category boundary inputs

    // just below normal weight (<18.5): 170cm and 53.462kg --> BMI: 18.499
    @Test
    void testGetCategory_justBelow18_5_isUnderweight() {
        assertEquals("Underweight", helper.getCategory(170, 53.462));
    }

    // exactly at normal weight (=18.5): 170cm and 53.465kg --> BMI: 18.5
    @Test
    void testGetCategory_exactlyAt18_5_isNormalWeight() {
        assertEquals("Normal weight", helper.getCategory(170, 53.465));
    }

    // just above bottom of normal weight (>18.5): 170cm and 53.494kg --> BMI: 18.51
    @Test
    void testGetCategory_justAbove18_5_isNormalWeight() {
        assertEquals("Normal weight", helper.getCategory(170, 53.494));
    }

    // just below top of normal weight (<25.0): 170cm and 72.221kg --> BMI: 24.99
    @Test
    void testGetCategory_justBelow25_isNormalWeight() {
        assertEquals("Normal weight", helper.getCategory(170, 72.221));
    }

    // exactly at overweight (=25.0): 170cm and 72.25 --> BMI: 25.0
    @Test
    void testGetCategory_exactlyAt25_isOverweight() {
        assertEquals("Overweight", helper.getCategory(170, 72.25));
    }

    // just above bottom of overweight (>25.0): 170cm and 72.279kg --> BMI: 25.01
    @Test
    void testGetCategory_justAbove25_isOverweight() {
        assertEquals("Overweight", helper.getCategory(170, 72.279));
    }

    // just below overweight (<30.0): 170cm and 86.671kg --> BMI: 29.99
    @Test
    void testGetCategory_justBelow30_isOverweight() {
        assertEquals("Overweight", helper.getCategory(170, 86.671));
    }

    // exactly at obese (=30.0): 170cm and 86.7kg --> BMI: 30.0
    @Test
    void testGetCategory_exactlyAt30_isObese() {
        assertEquals("Obese", helper.getCategory(170, 86.7));
    }

    // just above obese (>30.0): 170cm and 86.729kg --> BMI: 30.01
    @Test
    void testGetCategory_justAbove30_isObese() {
        assertEquals("Obese", helper.getCategory(170, 86.729));
    }
}