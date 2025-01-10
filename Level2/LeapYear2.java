import java.util.Scanner;

/**
 * This class determines whether a given year is a leap year or not.
 */
public class LeapYear2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        
        // Read the year from the user
        int year = sc.nextInt();
        
        // Check if the year is a leap year
        // A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400
        // Additionally, the year must be 1582 or later, as the Gregorian calendar was introduced in 1582
        if ((year >= 1582) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            // If the year is a leap year, print a message indicating so
            System.out.println(year + " is a Leap year.");
        } else {
            // If the year is not a leap year, print a message indicating so
            System.out.println(year + " is not a Leap year.");
        }
    }
}