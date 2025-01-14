import java.util.Scanner;

// Main class containing the main method
public class lengthofstr {
    // Main method where the program execution begins
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        
        // Read the user input and store it in the 'str' variable
        String str = scanner.next();

        // Calculate the length of the string using a custom method
        int lengthUsingMethod = findLength(str);
        
        // Calculate the length of the string using the built-in length() method
        int lengthUsingBuiltIn = str.length();

        // Print the lengths of the string calculated using both methods
        System.out.println("Length of the string using custom method: " + lengthUsingMethod);
        System.out.println("Length of the string using built-in method: " + lengthUsingBuiltIn);
    }

    // Custom method to calculate the length of a string
    public static int findLength(String str) {
        // Initialize a counter variable to keep track of the string length
        int count = 0;
        
        // Use a try-catch block to handle the StringIndexOutOfBoundsException
        try {
            // Use a while loop to iterate over the characters in the string
            while (true) {
                // Attempt to access the character at the current index
                str.charAt(count);
                
                // If successful, increment the counter
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // If an exception is caught, return the current count as the string length
            return count;
        }
    }
}