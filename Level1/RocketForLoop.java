import java.util.Scanner;

// Define a class to demonstrate a for loop in Java
public class RocketForLoop {
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter number: ");
        
        // Read the user's input and store it in the counter variable
        int counter = sc.nextInt();

        // Use a for loop to print numbers from the user's input down to 1
        for (int i = counter; i > 0 ; i--) {
            // Print the current number in the loop
            System.out.println(i);
        }
    }
}