import java.util.Scanner;

/**
 * This class solves problem 14, converting distance from feet to yards and miles.
 */
public class Problem14 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a distance in feet
        System.out.print("Enter Distance in feet: ");

        // Read the user's input and store it in the 'feet' variable
        double feet = sc.nextDouble();

        // Convert the distance from feet to yards (1 yard = 3 feet)
        double yard = feet / 3;

        // Convert the distance from yards to miles (1 mile = 1760 yards)
        double mile = yard / 1760;

        // Print the results to the console
        System.out.print("Distance in feet is " + feet + " while in yard is " + yard + " and in mile is " + mile);
    }
}