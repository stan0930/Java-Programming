import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; 
        final double METERS_PER_INCH = 0.0254; 

        double weightInKilograms = pounds * KILOGRAMS_PER_POUND;
        double heightInMeters = inches * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.4f\n", bmi);
    }
}
