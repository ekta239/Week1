public class Strcompare {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        compareStrings(str1, str2);
    }

    public static void compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
                return;
            } else if (ch1 > ch2) {
                System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
                return;
            }
        }

        if (len1 < len2) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (len1 > len2) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            System.out.println(str1 + " and " + str2 + " are equal in lexicographical order");
        }
    }
}