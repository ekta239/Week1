public class arrayindexoutofbound {
    // Main method to test ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        // Generate and handle ArrayIndexOutOfBoundsException
        generateException();
        handleException();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException() {
        // Define an array of names
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        try {
            // Attempt to access an index that is out of bounds
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException() {
        // Define an array of names
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            // Attempt to access an index that is out of bounds
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and print the exception message
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and print any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}