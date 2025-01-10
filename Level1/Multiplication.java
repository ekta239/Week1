import java.util.Scanner;

/**
 * This class demonstrates a simple multiplication table.
 */
public class Multiplication {
    // The main method where the program starts execution.
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the user's input and store it in the variable 'num'
        int num = sc.nextInt();
        
        // Print the multiplication table for the given number from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication equation and result
            System.out.println(num + " * " + i + " = " + num * i);
        }
    
    }
}