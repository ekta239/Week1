import java.util.Scanner;

public class SampleProblem {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for and read the name of the traveler
        System.out.print("Enter the traveler's name: ");
        String name = scanner.nextLine();
        
        // Ask for and read the cities (fromCity, viaCity, toCity)
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();
        
        // Ask for and read the distances (fromCity to viaCity, viaCity to toCity)
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = scanner.nextDouble();
        
        // Ask for and read the time from fromCity to viaCity
        System.out.print("Enter the time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = scanner.nextInt();
        
        // Ask for and read the distance from viaCity to toCity
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = scanner.nextDouble();
        
        // Ask for and read the time from viaCity to toCity
        System.out.print("Enter the time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();
        
        // Calculate the total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        
        // Calculate the total time
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes");

        // Close the scanner
        scanner.close();
    }
}
