import java.util.Scanner;

/**
 * This class takes an integer input from the user, 
 * reverses its digits and prints them in reverse order.
 */
public class arrayReverse {
    public static void main(String[] args) {
        // Take user input for a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        // Initialize variables to store the reversed digits
        int j = 0;
        int[] digit = new int[10];

        // Extract each digit from the input number and store in the array
        while (number != 0) {
            digit[j] = number % 10;
            number /= 10;
            j++;
        }

        // Display the elements of the array in reverse order
        System.out.println("Reversed digits:");
        for (int i = 0; i < j; i++) {
            System.out.print(digit[i] + " ");
        }
    }
}