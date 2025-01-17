public class substr {
    public static int countSubstringOccurrences(String str, String substr) {
        int count = 0;
        int index = str.indexOf(substr);
        while (index != -1) {
            count++;
            index = str.indexOf(substr, index + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello, world. Hello again.";
        String substr = "Hello";
        System.out.println("The substring '" + substr + "' occurs " + countSubstringOccurrences(str, substr) + " times in the string.");
    }
}