public class Split {
    // Main method to test the string splitting functionality
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a text
        System.out.println("Enter a text:");
        
        // Read the user input and store it in the 'text' variable
        String text = scanner.nextLine();
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Split the input text into words using the built-in split() method
        String[] wordsUsingSplit = text.split("\\s+");
        
        // Split the input text into words using the custom splitText() method
        String[] wordsUsingCustomMethod = splitText(text);

        // Print the words obtained using the split() method
        System.out.println("Words using split() method:");
        printArray(wordsUsingSplit);

        // Print the words obtained using the custom method
        System.out.println("Words using custom method:");
        printArray(wordsUsingCustomMethod);

        // Compare the two arrays and print the result
        System.out.println("Are the two arrays equal? " + compareArrays(wordsUsingSplit, wordsUsingCustomMethod));
    }

    // Method to find the length of a given string
    public static int findLength(String str) {
        // Initialize a variable to store the length
        int length = 0;
        
        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Increment the length for each character
            length++;
        }
        
        // Return the calculated length
        return length;
    }

    // Custom method to split a given text into words
    public static String[] splitText(String text) {
        // Initialize variables to store the word count and space indexes
        int wordCount = 0;
        int[] spaceIndexes = new int[text.length()];
        int spaceIndex = 0;

        // Iterate over each character in the text
        for (int i = 0; i < text.length(); i++) {
            // Check if the current character is a space
            if (text.charAt(i) == ' ') {
                // Store the space index and increment the word count
                spaceIndexes[spaceIndex++] = i;
                wordCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount + 1];
        
        // Initialize a variable to store the current word index
        int wordIndex = 0;

        // Iterate over each space index
        for (int i = 0; i < spaceIndex; i++) {
            // Extract the word from the text using substring() method
            words[wordIndex++] = text.substring(0, spaceIndexes[i]);
            
            // Update the text by removing the extracted word
            text = text.substring(spaceIndexes[i] + 1);
        }

        // Store the last word in the array
        words[wordIndex] = text;
        
        // Return the array of words
        return words;
    }

    // Method to compare two arrays for equality
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        // Check if the arrays have the same length
        if (arr1.length != arr2.length) {
            // Return false if the lengths are different
            return false;
        }

        // Iterate over each element in the arrays
        for (int i = 0; i < arr1.length; i++) {
            // Check if the corresponding elements are equal
            if (!arr1[i].equals(arr2[i])) {
                // Return false if any pair of elements is not equal
                return false;
            }
        }

        // Return true if all pairs of elements are equal
        return true;
    }

    // Method to print the elements of an array
    public static void printArray(String[] arr) {
        // Iterate over each element in the array
        for (String str : arr) {
            // Print the element followed by a space
            System.out.print(str + " ");
        }
        
        // Print a newline character to move to the next line
        System.out.println();
    }
}