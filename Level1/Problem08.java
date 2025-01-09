import java.util.Scanner;

/**
 * This class solves the problem of converting kilometers to miles.
 */
public class Problem08 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter kilometers: ");

        // Read the user's input and store it in the km variable
        double km = sc.nextDouble(); // Use nextDouble() instead of nextInt() for decimal input

        // Convert kilometers to miles (1 kilometer = 1.6 miles)
        double m = km / 1.6;

        // Print the result to the console
        System.out.print("The total miles is " + m + " miles for the given " + km + " km");
    }
}