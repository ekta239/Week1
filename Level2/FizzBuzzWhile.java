import java.util.Scanner;

/**
 * This class implements the FizzBuzz problem using a while loop.
 * It takes a positive integer as input from the user and prints
 * Fizz, Buzz, or FizzBuzz for multiples of 3, 5, or both, respectively.
 */
public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Validate the input
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        // Initialize a counter variable
        int i = 0;

        // Loop from 0 to the input number
        while (i <= num) {
            // Check for multiples of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if it's not a multiple of 3 or 5
            else {
                System.out.println(i);
            }

            // Increment the counter
            i++;
        }
    }
}