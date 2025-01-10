import java.util.Scanner;

/**
 * This class determines whether a given date falls within the Spring season.
 */
public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the month number
        System.out.print("Enter the month number: ");
        int month = input.nextInt();

        // Prompt the user to enter the day of the month
        System.out.print("Enter day of the month: ");
        int day = input.nextInt();

        // Check if the date falls within the Spring season (March 20 to June 19)
        if (month == 3 && day > 20 || month == 4 || month == 5 || month == 6 && day < 20) {
            // If the date is within the Spring season, print a corresponding message
            System.out.println("It's a Spring Season.");
        } else {
            // If the date is not within the Spring season, print a corresponding message
            System.out.println("Not a Spring Season.");
        }
    }
}