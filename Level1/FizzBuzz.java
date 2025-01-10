import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        // Validate user input
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Create a String array to store the results
        String[] results = new String[n + 1];

        // Loop from 0 to the input number
        for (int i = 0; i <= n; i++) {
            // Check for multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
            // For non-multiples, store the number as a string
            else {
                results[i] = String.valueOf(i);
            }
        }

        // Print the results
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}