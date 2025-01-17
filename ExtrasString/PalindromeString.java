public class PalindromeString {
    /**
     * Checks if a given string is a palindrome.
     * 
     * @param str the input string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Initialize two pointers, one at the start and one at the end of the string
        int left = 0;
        int right = cleanStr.length() - 1;
        
        // Compare characters from the start and end, moving towards the center
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}