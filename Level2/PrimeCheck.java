import java.util.Scanner;

/**
 * This class checks whether a given number is prime or not.
 */
public class PrimeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the user input
        int n = sc.nextInt(); 
        
        // Close the Scanner object to prevent resource leak
        sc.close();
        
        // Check if the number is less than or equal to 1
        if (n <= 1) {
            // If true, print that the number is not prime and exit the method
            System.out.println(n + " is not a prime number.");
            return;
        }

        // Initialize a flag to true, assuming the number is prime
        boolean isPrime = true;
        
        // Iterate from 2 to half of the number
        for (int i = 2; i <= n / 2; i++) {
            // Check if the number is divisible by the current iteration
            if (n % i == 0) {
                // If true, set the flag to false and break the loop
                isPrime = false;
                break;
            }
        }
        
        // Print whether the number is prime or not
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}