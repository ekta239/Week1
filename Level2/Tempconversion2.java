import java.util.Scanner;

/**
 * This class is used to convert temperature from Fahrenheit to Celsius.
 */
public class TempConversion2 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the temperature in Fahrenheit from the user
        double fahrenheit = sc.nextDouble();

        // Convert the temperature from Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result to the user
        System.out.print("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}