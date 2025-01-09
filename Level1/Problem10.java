import java.util.Scanner;

/**
 * This class solves problem 10 by converting height in centimeters to feet and inches.
 */
public class Problem10 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter height in cm: ");

        // Read the user's height in centimeters
        double height = sc.nextDouble();

        // Convert the height from centimeters to inches
        double