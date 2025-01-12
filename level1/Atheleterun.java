import java.util.Scanner;
public class Atheleterun {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the length of each side of the track
        System.out.println("Enter the length of side 1 in meters:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2 in meters:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of side 3 in meters:");
        double side3 = scanner.nextDouble();
        
        // Calculate and display the number of rounds to complete 5km run
        System.out.println("Number of rounds to complete 5km run: " + calculateRounds(side1, side2, side3));
    }

   
    public static double calculateRounds(double side1, double side2, double side3) {
        // Calculate the perimeter of the track
        double perimeter = side1 + side2 + side3;
        
        // Define the distance of 5km run in meters
        double distanceInMeters = 5 * 1000; // 5 km in meters
        
        // Calculate the number of rounds to complete 5km run
        return distanceInMeters / perimeter;
    }
}