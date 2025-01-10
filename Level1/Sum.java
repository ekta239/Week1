import java.util.Scanner;

// Define a class to calculate the sum of numbers
public class Sum {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize a variable to store the total sum
        double total = 0.0;
    

        // Prompt the user to enter numbers to add
        System.out.print("Enter numbers to add (enter 0 to stop):");
        
        // Read the first number from the user
        double num = sc.nextDouble();

        // Continue reading numbers until the user enters 0
        while (num != 0) {
            // Add the current number to the total sum
            total += num;
            
            // Prompt the user to enter another number
            System.out.print("Enter another number: ");
            
            // Read the next number from the user
            num = sc.nextDouble();
        }

        // Display the total sum to the user
        System.out.println("The total sum is: " + total);
    }
}