import java.util.Scanner;

/**
 * This class demonstrates the conversion of a string to uppercase using a custom method and the built-in toUpperCase() method.
 */
public class uppercase {
    /**
     * The main method where the program starts execution.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a text.
        System.out.println("Enter a text:");
        
        // Read the text entered by the user.
        String text = scanner.nextLine();
        
        // Convert the text to uppercase using the custom toUppercase() method.
        String uppercaseText = toUppercase(text);
        
        // Convert the text to uppercase using the built-in toUpperCase() method.
        String uppercaseTextBuiltIn = text.toUpperCase();
        
        // Compare the two uppercase strings for equality.
        boolean isEqual = compareStrings(uppercaseText, uppercaseTextBuiltIn);
        
        // Print the converted uppercase text.
        System.out.println("Converted to uppercase: " + uppercaseText);
        
        // Print whether the custom uppercase text is equal to the built-in uppercase text.
        System.out.println("Is equal to built-in uppercase: " + isEqual);
    }

    /**
     * Converts a string to uppercase using a custom method.
     * 
     * @param text The string to be converted to uppercase.
     * @return The uppercase string.
     */
    public static String toUppercase(String text) {
        // Convert the string to a character array.
        char[] chars = text.toCharArray();
        
        // Iterate over each character in the array.
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            
            // Check if the character is a lowercase letter.
            if (c >= 'a' && c <= 'z') {
                // Convert the lowercase letter to uppercase by subtracting 32 from its ASCII value.
                chars[i] = (char) (c - 32);
            }
        }
        
        // Return the uppercase string.
        return new String(chars);
    }

    /**
     * Compares two strings for equality.
     * 
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return True if the strings are equal, false otherwise.
     */
    public static boolean compareStrings(String str1, String str2) {
        // Check if the lengths of the two strings are equal.
        if (str1.length() != str2.length()) {
            // If the lengths are not equal, the strings are not equal.
            return false;
        }
        
        // Iterate over each character in the first string.
        for (int i = 0; i < str1.length(); i++) {
            // Check if the characters at the current position in both strings are equal.
            if (str1.charAt(i) != str2.charAt(i)) {
                // If the characters are not equal, the strings are not equal.
                return false;
            }
        }
        
        // If the loop completes without finding any unequal characters, the strings are equal.
        return true;
    }
}