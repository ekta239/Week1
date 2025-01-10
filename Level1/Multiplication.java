import java.util.Scanner;


/**
 * This class generates the multiplication table of a given number.
 */
public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);


        // Prompt the user to enter a number
        System.out.print("Enter a number: ");


        // Read the user's input and store it in the variable 'num'
        int num = sc.nextInt();


        // Create an array to store the multiplication results
        int[] arr = new int[10];


        // Calculate the multiplication results and store them in the array
        for (int i = 0; i < 10; i++) {
            arr[i] = num * (i + 1);
        }


        // Print the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + arr[i]);
        }
    }
}
