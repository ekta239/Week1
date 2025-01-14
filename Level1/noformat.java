public class noformat {
    /**
     * Main method to test the NumberFormatException handling.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a string.
        System.out.println("Enter the String:");
        
        // Read the input string from the user.
        String str = scanner.nextLine();
        
        // Call the methods to generate and handle NumberFormatException.
        generateNumberFormatException(str);
        handleNumberFormatException(str);
    }

    /**
     * Method to generate a NumberFormatException.
     * 
     * @param text The input string to be parsed as an integer.
     */
    public static void generateNumberFormatException(String text) {
        // Try to parse the input string as an integer.
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } 
        // Catch the NumberFormatException if the input string cannot be parsed as an integer.
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

    /**
     * Method to handle a NumberFormatException.
     * 
     * @param text The input string to be parsed as an integer.
     */
    public static void handleNumberFormatException(String text) {
        // Try to parse the input string as an integer.
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } 
        // Catch the NumberFormatException if the input string cannot be parsed as an integer.
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } 
        // Catch any other RuntimeException that may occur.
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}