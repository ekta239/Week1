public class Strindexoutofbound {
    // Main method to call other methods
    public static void main(String[] args) {
        // Generate and handle StringIndexOutOfBoundsException
        generateException();
        handleException();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        // Initialize a string
        String str = "Hello";
        System.out.println("String: " + str);
        System.out.println("Length of the String: " + str.length());
        System.out.println("Trying to access index beyond the length of the String...");
        try {
            // Attempt to access an index that is out of bounds
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
 
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException() { 
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read a string from the user
        String str = scanner.nextLine();
        System.out.print("Enter an index to access: ");
        // Read an index from the user
        int index = scanner.nextInt();
        // Close the Scanner object
        scanner.close();
        try {
            // Attempt to access the character at the specified index
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}