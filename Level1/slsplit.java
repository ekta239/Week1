public class slsplit{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        String[] words = splitTextIntoWords(text);
        String[][] wordLengths = getWordLengths(words);
        int[] shortestLongest = findShortestLongest(wordLengths);
        System.out.println("Shortest word length: " + shortestLongest[0]);
        System.out.println("Longest word length: " + shortestLongest[1]);
    }

    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount + 1];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[wordIndex] = word;
        return words;
    }

    // Method to find the length of a string
    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to get the word lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest strings
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        for (int i = 0; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        return new int[] { shortest, longest };
    }
}