import java.util.Scanner;

/**
 * This class calculates the sum of natural numbers up to a given number using a while loop and a formula.
 */
public class SumForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user's input and store it in the variable 'n'
        int n = sc.nextInt();

        // Initialize a variable to store the sum of natural numbers
        int sumOfNum = 0;

        for (int i = 0; i <= n; i++) {
            sumOfNum += i;
        }

        // Calculate the sum of natural numbers up to 'n' using the formula n*(n+1)/2
        int sumOfFormula = n * (n + 1) / 2;

        // Print the results of both calculations
        System.out.println("Sum of " + n + " natural numbers using while loop: " + sumOfNum);
        System.out.println("Sum of " + n + " natural numbers using formula: " + sumOfFormula);

        // Check if both calculations produce the same result
        if (sumOfNum == sumOfFormula) {
            // If they do, print a success message
            System.out.println("Both computations are correct.");
        } else {
            // If they don't, print an error message
            System.out.println("Computations are incorrect.");
        }
    }
}