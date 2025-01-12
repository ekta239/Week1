import java.util.Scanner;

// Main class to calculate the quotient and remainder of two numbers
public class twonumqr {
    // Main method to start the program
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number:");
        int number = scanner.nextInt();
        
        // Prompt the user to enter the second number (divisor)
        System.out.print("Enter the second number:");
        int divisor = scanner.nextInt();
        
        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Print the quotient and remainder
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    // Method to calculate the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate the quotient using integer division
        int quotient = number / divisor;
        
        // Calculate the remainder using the modulus operator
        int remainder = number % divisor;
        
        // Return the quotient and remainder as an array
        return new int[] {quotient, remainder};
    }
}