import java.util.Scanner;

/**
 * This class demonstrates the handling of IllegalArgumentException and RuntimeException.
 */
public class IllegalArgument {
    /**
     * Main method to call other methods.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Call method to generate an exception
        generateException();
        
        // Call method to handle RuntimeException
        handleRuntimeException();
    }

    /**
     * Method to generate a StringIndexOutOfBoundsException.
     */
    public static void generateException() {
        // Define a string
        String str = "Hello";
        
        try {
            // Attempt to get a substring with invalid indices
            System.out.println(str.substring(3, 1));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    /**
     * Method to handle RuntimeException.
     */
    public static void handleRuntimeException() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.println("Enter a string:");
        
        // Read user input
        String str = scanner.nextLine();
        
        try {
            // Attempt to get a substring with invalid indices
            System.out.println(str.substring(3, 1));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("RuntimeException caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Catch and print the exception message
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}