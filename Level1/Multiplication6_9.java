import java.util.Scanner;

// Define a class to perform multiplication operations
public class Multiplication6_9 {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the user's input and store it in the 'num' variable
        int num = sc.nextInt();
        
        // Create an array to store the multiplication results
        int[] arr = new int[4];
        
        // Calculate the multiplication results for numbers 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Store the result in the corresponding array index
            arr[i-6] = num * i;
        }
        
        // Print the multiplication results
        for (int i = 6; i <= 9; i++) {
            // Display the multiplication equation and result
            System.out.println(num + " * " + i + " = " + arr[i-6]);
        }
    }
}