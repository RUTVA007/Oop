


Oop_pratical4



import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Input height in inches
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert to metric units
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}




Output:
enter your weight in pounds : 150
enter your height in inches: 65
your BMI is ; 24.96
       

