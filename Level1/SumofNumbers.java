import java.util.Scanner;

/**
 * This class calculates the sum of a series of numbers input by the user.
 */
public class SumofNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Initialize a variable to store the total sum
        double total = 0.0;

        // Create an array to store the input numbers
        double[] arr = new double[10];

        // Loop through the array to read and process user input
        for (int i = 0; i < 10; i++) {
            // Read the next number from the user
            arr[i] = sc.nextDouble();

            // Check if the input number is less than or equal to 0
            if (arr[i] <= 0) {
                // If so, break out of the loop
                break;
            }

            // Add the input number to the total sum
            total = total + arr[i];
        }

        // Print the total sum to the console
        System.out.println("Total value: " + total);
    }
}