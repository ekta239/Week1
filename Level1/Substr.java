public class Substr{
    
    public static String substr(String s, int st, int en) {
        // Initialize an empty string to store the substring
        String sub = "";
        
        // Iterate over the characters in the string from the start index to the end index
        for (int i = st; i < en; i++) {
            // Append each character to the substring
            sub += s.charAt(i);
        }
        
        // Return the substring
        return sub;
    }

    
    public static boolean compare(String s1, String s2) {
        // Assume the strings are equal initially
        boolean r = true;
        
        // Use a labeled loop to break out of the loop when a mismatch is found
        check:
        for (int i = 0; i < s1.length(); i++) {
            // If a mismatch is found, set the result to false and break out of the loop
            if (s1.charAt(i) != s2.charAt(i)) {
                r = false;
                break check;
            }
        }
        
        // Return the result of the comparison
        return r;
    }

    
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        String s = sc.next();
        
        // Prompt the user to enter the start index of the substring
        System.out.print("Enter Starting Index: ");
        int st = sc.nextInt();
        
        // Prompt the user to enter the end index of the substring
        System.out.print("Enter End Index: ");
        int end = sc.nextInt();
        
        // Extract the substring using the substr method
        String s1 = substr(s, st, end);
        
        // Extract the substring using the substring method
        String s2 = s.substring(st, end);
        
        // Print the substrings
        System.out.println("Substring using fxn : " + s1);
        System.out.println("Substring using method: " + s2);
        
        // Compare the substrings and print the result
        System.out.println("String comparison result: " + compare(s1, s2));
    }
}