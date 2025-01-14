import java.util.Scanner;

/**
 * This class demonstrates the conversion of text to lowercase and comparison of strings.
 */
public class lowercase {
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
        
        // Convert the text to uppercase.
        String upperCaseText = text.toUpperCase();
        
        // Convert the text to lowercase using the toLowerCase method.
        String lowerCaseText = toLowerCase(text);
        
        // Compare the uppercase and lowercase texts using the compareStrings method.
        boolean isEqual = compareStrings(upperCaseText, lowerCaseText);
        
        // Print whether the uppercase and lowercase texts are equal.
        System.out.println("Is equal: " + isEqual);
        
        // Split the text into words and their lengths using the splitTextIntoWords method.
        String[][] wordsWithLengths = splitTextIntoWords(text);
        
        // Print each word and its length.
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }
    }

    /**
     * Converts a given text to lowercase.
     * 
     * @param text The text to be converted to lowercase.
     * @return The text in lowercase.
     */
    public static String toLowerCase(String text) {
        // Convert the text to a character array.
        char[] chars = text.toCharArray();
        
        // Iterate over each character in the array.
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is an uppercase letter.
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert the uppercase letter to lowercase by adding 32 to its ASCII value.
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        // Return the text in lowercase.
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
        // Check if the lengths of the strings are equal.
        if (str1.length() != str2.length()) {
            // If the lengths are not equal, the strings are not equal.
            return false;
        }
        
        // Iterate over each character in the strings.
        for (int i = 0; i < str1.length(); i++) {
            // Check if the characters at the current position are equal.
            if (str1.charAt(i) != str2.charAt(i)) {
                // If the characters are not equal, the strings are not equal.
                return false;
            }
        }
        
        // If all characters are equal, the strings are equal.
        return true;
    }

    /**
     * Splits a given text into words and their lengths.
     * 
     * @param text The text to be split into words and their lengths.
     * @return A 2D array where each sub-array contains a word and its length.
     */
    public static String[][] splitTextIntoWords(String text) {
        // Split the text into words using the split method with a regular expression for one or more whitespace characters.
        String[] words = text.split("\\s+");
        
        // Create a 2D array to store the words and their lengths.
        String[][] wordsWithLengths = new String[words.length][2];
        
        // Iterate over each word.
        for (int i = 0; i < words.length; i++) {
            // Store the word and its length in the 2D array.
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(words[i].length());
        }
        
        // Return the 2D array of words and their lengths.
        return wordsWithLengths;
    }
}