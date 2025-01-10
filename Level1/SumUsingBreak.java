import java.util.Scanner;

/**
 * This class calculates the sum of numbers input by the user.
 */
public class SumUsingBreak {
    // The main method where the program starts execution.
    
    public static void main(String[] args) {
        // Initialize the total sum to 0
        double total = 0;
       
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
       
        // Prompt the user to enter numbers to add
        System.out.print("Enter number to add (enter 0 to stop): ");
       
        // Continue reading numbers until the user enters 0
        while (true) {
            // Read the next number from the user
            double num = sc.nextDouble();
           
            // Check if the user wants to stop (i.e., entered 0)
            if (num == 0) {
                // Exit the loop if the user wants to stop
                break;
            }
           
            // Add the number to the total sum
            total += num;
        }
       
        // Print the final sum
        System.out.println("Sum: " + total);
    }
}