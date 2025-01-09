import java.util.Scanner;

/**
 * This class calculates the total number of rounds an athlete needs to run to complete 5 km.
 */
public class AthleteRuns {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides of the track in meters
        System.out.print("Enter side1 in meters: ");
        int s1 = sc.nextInt();
        System.out.print("Enter side2 in meters: ");
        int s2 = sc.nextInt();
        System.out.print("Enter side3 in meters: ");
        int s3 = sc.nextInt();

        // Calculate the perimeter of the track in kilometers
        int p = (s1 + s2 + s3) / 1000;

        // Calculate and display the total number of rounds the athlete needs to run to complete 5 km
        System.out.print("The total number of rounds the athlete will run is " + 5 / p + " to complete 5 km");
    }
}