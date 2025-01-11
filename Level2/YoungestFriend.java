import java.util.Scanner;
public class YoungestFriend {
    public static void main(String[] args) {
        // Declare variables to store the names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Declare variables to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height for the 3 friends
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + friends[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Initialize variables to store the youngest and tallest friends
        String youngestFriend = friends[0];
        int youngestAge = ages[0];
        String tallestFriend = friends[0];
        double tallestHeight = heights[0];

        // Loop through the array and find the youngest and tallest friends
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");
    }
}