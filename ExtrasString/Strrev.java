public class Strrev {
    // Main method to test the string reversal functionality
    public static void main(String[] args) {
        // Original string to be reversed
        String str = "Hello World";
        // Print the original string
        System.out.println("Original String: " + str);
        // Print the reversed string
        System.out.println("Reversed String: " + reverseString(str));
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        // Convert the string to a character array for easier manipulation
        char[] arr = str.toCharArray();
        // Initialize two pointers, one at the start and one at the end of the array
        int left = 0;
        int right = arr.length - 1;
        // Swap characters from the start and end, moving towards the center
        while (left < right) {
            // Temporary variable to hold the character at the left index
            char temp = arr[left];
            // Swap the characters at the left and right indices
            arr[left] = arr[right];
            arr[right] = temp;
            // Move the pointers towards the center
            left++;
            right--;
        }
        // Return the reversed string
        return new String(arr);
    }
}