import java.util.Scanner;

/**
 * This class checks if a given number is divisible by 5.
 */
public class Div5 {
    /**
     * The main method where the program starts execution.
     * 
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number.
        System.out.print("Enter number: ");
        
        // Read the number entered by the user.
        int n = sc.nextInt();
        
        // Check if the number is divisible by 5.
        if (n % 5 == 0) {
            // If the number is divisible by 5, print a message indicating so.
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        } else {
            // If the number is not divisible by 5, print a message indicating so.
            System.out.println("Is the number " + n + " divisible by 5? No");
        }
    }
}