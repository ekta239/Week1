import java.util.Scanner;

/**
 * This class checks whether a given number is positive, negative, or zero.
 */
public class CheckNumber {
    // The main method where the program starts execution.

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");

        // Read the number entered by the user.
        int n = sc.nextInt();

        // Check if the number is positive, negative, or zero.
        if (n > 0) {
            // If the number is positive, print "Positive."
            System.out.println("Positive.");
        } else if (n < 0) {
            // If the number is negative, print "Negative."
            System.out.println("Negative.");
        } else {
            // If the number is zero, print "Zero."
            System.out.println("Zero.");
        }
    }
}