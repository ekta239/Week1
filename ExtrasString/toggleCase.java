public class toggleCase {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello World"));  // Output: hELLO wORLD
    }
}