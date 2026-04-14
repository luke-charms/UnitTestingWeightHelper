/**
 * WeightHelper
 *
 * Calculates BMI and classifies weight according to BMI
 *
 * BMI formula:  bmi = weight / (height_in_metres)^2
 *
 *   Underweight  : BMI < 18.5
 *   Normal weight: 18.5 <= BMI < 25
 *   Overweight   : 25   <= BMI < 30
 *   Obese        : BMI >= 30
 */
public class WeightHelper {
    public double calculateBMI(double height, double weight) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                "Height must be greater than or equal to zero, got: " + height);
        }
        if (weight < 0) {
            throw new IllegalArgumentException(
                "Weight must be greater than zero, got: " + weight);
        }
        double heightM = height / 100.0;
        return weight / (heightM * heightM);
    }

    public String getCategory(double height, double weight) {
        double bmi = calculateBMI(height, weight);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}