import java.util.Scanner;


public class chocolate {

   
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate the remainder using the modulus operator.
        int remainder = number % divisor;
        
        // Calculate the quotient using integer division.
        int quotient = number / divisor;
        
        // Return the remainder and quotient as an array.
        return new int[] { remainder, quotient };
    }

   
    public static void main(String[] args) {
        // Create a new Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number.
        System.out.println("Enter the number: ");
        
        // Read the user's input and store it in the 'number' variable.
        int number = scanner.nextInt();
        
        // Prompt the user to enter a divisor.
        System.out.println("Enter the divisor: ");
        
        // Read the user's input and store it in the 'divisor' variable.
        int divisor = scanner.nextInt();
        
        // Call the findRemainderAndQuotient method and store the result in the 'result' array.
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Print the remainder.
        System.out.println("Remainder: " + result[0]);
        
        // Print the quotient.
        System.out.println("Quotient: " + result[1]);
    }
}