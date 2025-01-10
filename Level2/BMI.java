import java.util.Scanner;

/**
 * This class calculates the Body Mass Index (BMI) of a person.
 */
public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their weight in kg
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        // Prompt the user to enter their height in cm
        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        // Convert the height from cm to meters
        double heightMeter = height / 100;

        // Calculate the BMI using the formula: weight / (height * height)
        double bmi = weight / (heightMeter * heightMeter);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the BMI category based on the calculated BMI
        if (bmi < 18.5) {
            // Underweight: BMI is less than 18.5
            System.out.println("Underweight");
        } else if (bmi < 25) {
            // Normal: BMI is between 18.5 and 25
            System.out.println("Normal");
        } else if (bmi < 30) {
            // Overweight: BMI is between 25 and 30
            System.out.println("Overweight");
        } else {
            // Obese: BMI is 30 or greater
            System.out.println("Obese");
        }
    }
}