import java.util.Scanner;

/**
 * This class calculates the factorial of a given number using a for loop.
 */
public class FactForLoop {
    // The main method where the program starts execution.
     
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a Number: ");
        
        // Read the number entered by the user
        int n = sc.nextInt();
        
        // Check if the number is less than or equal to 0
        if (n <= 0) {
            // If the number is negative, print a message indicating that
            System.out.println(n + " is a Negative number.");
        } else {
            // Initialize a variable to store the factorial
            int fact = 1;
            
            // Use a for loop to calculate the factorial
            for (int i = 1; i <= n; i++) {
                // Multiply the current factorial by the current number
                fact *= i;
            }
            
            // Print the calculated factorial
            System.out.println("The Factorial of " + n + " is " + fact);
        }
    }
}