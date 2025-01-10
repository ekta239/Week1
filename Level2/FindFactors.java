import java.util.Scanner;

// Class to find factors of a given number
public class FindFactors {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        
        // Read the user input and store it in the variable 'num'
        int num = sc.nextInt();
    

        // Check if the input number is less than or equal to 0
        if (num <= 0) {
            // If true, print an error message
            System.out.println("Please enter a positive integer.");
        } else {
            // If false, print the factors of the input number
            System.out.println("Factors of " + num + ":");
            
            // Iterate from 1 to the input number
            for (int i = 1; i <= num; i++) { 
                // Check if 'i' is a factor of the input number
                if (num % i == 0) {
                    // If true, print the factor
                    System.out.print(i + " ");
                }
            }
        }
    }
}