public class longestword {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("The longest word is: " + findLongestWord(sentence));
    }
}