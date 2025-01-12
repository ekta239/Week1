import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        // Get integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Call the method to find the sum of n natural numbers
        int sum = findSum(n);

        // Print the result
        System.out.println("The sum of " + n + " natural numbers is: " + sum);
    }

    
    public static int findSum(int n) {
        int sum = 0; // Initialize the sum variable
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum += i; // Add the current number to the sum
        }
        return sum; // Return the sum
    }
}