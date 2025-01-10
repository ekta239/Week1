import java.util.Scanner;

/**
 * This class demonstrates the use of a while loop to print numbers from a user input down to 1.
 */
public class RocketWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter number: ");

        // Read the user's input and store it in the counter variable
        int counter = sc.nextInt();

        // Use a while loop to print numbers from the counter down to 1
        while (counter >= 1) {
            // Print the current counter value
            System.out.println(counter);

            // Decrement the counter for the next iteration
            counter--;
        }
    }
}