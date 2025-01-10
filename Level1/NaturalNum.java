import java.util.Scanner;

/**
 * This class calculates the sum of natural numbers up to a given number.
 */
public class NaturalNum {
    /**
     * The main method where the program starts execution.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");

        // Read the number entered by the user.
        int n = sc.nextInt();

        // Initialize a variable to store the sum of natural numbers.
        int sum = 0;

        // Check if the number is a natural number (non-negative).
        if (n >= 0) {
            // Calculate the sum of natural numbers using the formula n*(n+1)/2.
            sum = n * (n + 1) / 2;

            // Print the result.
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            // Print an error message if the number is not a natural number.
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}