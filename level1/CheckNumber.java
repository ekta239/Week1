import java.util.Scanner;

public class CheckNumber {

   
    public static int numType(int a) {
        // Check if the number is negative
        if (a < 0) {
            return -1;
        } 
        // Check if the number is zero
        else if (a == 0) {
            return 0;
        } 
        // If the number is neither negative nor zero, it's positive
        else {
            return 1;
        }

    }

    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the user's input
        int num = input.nextInt();
        
        // Determine the type of the number
        int result = numType(num);
        
        // Print the result
        if (result == -1) {
            System.out.println("The number is negative.");
        }
        else if (result == 0) {
            System.out.println("The number is zero.");
        }
        else {
            System.out.println("The number is positive.");
        }
    }

}