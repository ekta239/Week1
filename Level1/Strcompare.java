public class Strcompare{
    // Main method to get user input and compare strings
    public static void main(String[]args){
        // Create a new Scanner object to read user input
        java.util.Scanner sc= new java.util.Scanner(System.in);
        
        // Prompt user to enter two strings
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second string: ");
        String s2 = sc.next();
        
        // Compare strings using custom compare method and equals() method
        System.out.println("Comparison result using loop: " + compare(s1, s2));
        System.out.println("Comparison result using equal() method: " + s1.equals(s2));
    }

    // Custom method to compare two strings character by character
    public static boolean compare(String s1, String s2){
        // Initialize a flag to true, assuming strings are equal
        boolean r = true;
        
        // Use a labeled loop to compare characters
        check:
        for (int i = 0; i < s1.length(); i++){
            // If characters at the same position are different, set flag to false and break the loop
            if (s1.charAt(i) != s2.charAt(i)){ 
                r = false;
                break check;
            }
        }
        // Return the comparison result
        return r;
    }
}