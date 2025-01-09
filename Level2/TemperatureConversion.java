import java.util.Scanner;

/**
 * This class provides a simple temperature conversion from Celsius to Fahrenheit.
 */
public class TemperatureConversion {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");

        // Read the temperature in Celsius from the user
        double celsius = sc.nextDouble();

        // Convert the temperature from Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result to the user
        System.out.print("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}