import java.util.Scanner;

// Define a class to find multiples of a given number
public class Multiple {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a non-zero number
        System.out.print("Enter a non-zero number: ");
        
        // Read the user input and store it in the 'num' variable
        int num = sc.nextInt();
        
        // Check if the input number is zero
        if (num == 0) {
            // If the number is zero, print an error message
            System.out.println("Zero is not a valid input.");
        } else {
            // If the number is not zero, print the multiples of the number from 100 to 1
            System.out.println("Multiples of " + num + " from 100 to 1:");
            
            // Use a for loop to iterate from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if the current number is a multiple of the input number
                if (i % num != 0) {
                // Skip the current iteration if the number is not a multiple of the input number
continue;
                 }   // If it is a multiple, print the number
                    System.out.print(i + " ");
                }
            }
        }
    }
