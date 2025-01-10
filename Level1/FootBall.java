import java.util.Scanner;

/**
 * This class calculates the mean height of a football team.
 */
public class FootBall {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Initialize a variable to store the sum of heights
        double sum = 0;

        // Prompt the user to enter the heights of the football team
        System.out.print("Enter heights: ");

        // Create an array to store the heights of the football team
        double[] heights = new double[11];

        // Read the heights of the football team from the user
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        // Calculate the sum of the heights
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        // Calculate and print the mean height of the football team
        System.out.println("The mean height of the football team is " + sum / 11);
    }
}