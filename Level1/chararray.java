public class chararray{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call the user-defined method to get the characters in the string
        char[] userDefinedChars = getChars(input);

        // Call the String built-in toCharArray() method to get the characters in the string
        char[] builtInChars = input.toCharArray();

        // Compare the two arrays and display the result
        System.out.println("User-defined method result: " + java.util.Arrays.toString(userDefinedChars));
        System.out.println("Built-in toCharArray() method result: " + java.util.Arrays.toString(builtInChars));
        System.out.println("Are the two arrays equal? " + compareArrays(userDefinedChars, builtInChars));
    }

    // Method to return the characters in a string without using the toCharArray() method
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two string arrays and return a boolean result
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}