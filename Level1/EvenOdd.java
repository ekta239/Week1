import java.util.Scanner;

/**
 * This class takes an input number from the user and separates the numbers from 1 to the input number into two arrays: even numbers and odd numbers.
 */
public class EvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read the user's input
        Scanner sc = new Scanner(System.in);

        // Read the input number from the user
        int num = sc.nextInt();

        // Check if the input number is a natural number (non-negative)
        if (num >= 0) {
            System.out.println(num + " is a natural number.");
        } else {
            // If the input number is not a natural number, print an error message and exit the program
            System.out.print("an error");
            System.exit(0);
        }

        // Create two arrays to store the even and odd numbers
        int[] even = new int[num / 2 + 1];
        int[] odd = new int[num / 2 + 1];

        // Initialize indices for the even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop through the numbers from 1 to the input number
        for (int i = 1; i <= num; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                // If the number is even, add it to the even array
                even[evenIndex++] = i;
            } else {
                // If the number is odd, add it to the odd array
                odd[oddIndex++] = i;
            }
        }

        // Print the even numbers array
        System.out.println("Even numbers array ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print the odd numbers array
        System.out.println("Odd numbers array ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}