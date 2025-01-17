public class palindrome {
    // Function to get user input
    public static String getInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Compare the string with its reverse
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPal) {
        if (isPal) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Main function
    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = isPalindrome(input);
        displayResult(input, isPalindrome);
    }
}