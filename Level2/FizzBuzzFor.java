import java.util.Scanner;

/**
 * This class implements the FizzBuzz problem using a for loop.
 * It takes a positive integer as input from the user and prints
 * "Fizz" for multiples of 3, "Buzz" for multiples of 5, and
 * "FizzBuzz" for multiples of both 3 and 5.
 */
public class FizzBuzzFor {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the input is a positive integer
        if (num <= 0) {
            // Print an error message if the input is not a positive integer
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Loop through numbers from 1 to the input number
            for (int i = 1; i <= num; i++) {
                // Check if the current number is a multiple of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    // Print "FizzBuzz" if the number is a multiple of both 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    // Print "Fizz" if the number is a multiple of 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    // Print "Buzz" if the number is a multiple of 5
                    System.out.println("Buzz");
                } else {
                    // Print the number itself if it's not a multiple of 3 or 5
                    System.out.println(i);
                }
            }
        }
    }
}