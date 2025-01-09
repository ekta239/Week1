import java.util.Scanner;

/**
 * This class solves problem 13, calculating the side length of a square given its perimeter.
 */
public class Problem13 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of square: ");

        // Read the perimeter from the user
        double perimeter = sc.nextInt();

        // Calculate the side length of the square (perimeter / 4)
        double side = perimeter / 4;

        // Print the result to the user
        System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}