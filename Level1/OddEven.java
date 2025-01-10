import java.util.Scanner;

/**
 * This class determines whether a given number is odd or even.
 */
public class OddEven {
    /**
     * The main method where the program starts execution.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the user's input and store it in the 'num' variable
        int num = sc.nextInt();

        // Check if the input number is less than 1
        if (num < 1) {
            // If the number is less than 1, print an error message
            System.out.println("Please enter a positive integer.");
        } else {
            // If the number is 1 or more, loop through numbers from 1 to the input number
            for (int i = 1; i <= num; i++) {
                // Check if the current number is even
                if (i % 2 == 0) {
                    // If the number is even, print a message indicating it's even
                    System.out.println(i + " is an even number.");
                } else {
                    // If the number is not even, print a message indicating it's odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}