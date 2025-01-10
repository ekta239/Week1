import java.util.Scanner;

public class YoungestOne{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter Amar's age and height in meters
        System.out.print("Enter Amar's age and height in meters: ");
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        // Prompt user to enter Akbar's age and height in meters
        System.out.print("Enter Akbar's age and height in meters: ");
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        // Prompt user to enter Anthony's age and height in meters
        System.out.print("Enter Anthony's age and height in meters: ");
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        // Find the youngest age among the three friends
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);

        // Initialize variable to store the name of the youngest friend
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest height among the three friends
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);

        // Initialize variable to store the name of the tallest friend
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Print the results
        System.out.println("The youngest friend is " + youngestFriend + " with an age of " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + " meters.");
    }
}