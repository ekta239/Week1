import java.util.Scanner;

public class Problem10 {
    // Main method 
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter height in cm: ");

        // Read the user's height from the console
        double height = sc.nextDouble();

        // Convert the height from centimeters to inches
        double inches = height/2.54;

        // Convert the height from inches to feet
        double feet = inches/12;
        
        // Print the user's height in centimeters, feet, and inches
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    }
}