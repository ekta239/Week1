import java.util.Scanner;

/**
 * This class calculates the weight of a person in pounds given their weight in kilograms.
 */
public class Weight {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter weight in kilograms: ");

        // Read the user's weight in kilograms
        double w = sc.nextDouble();

        // Convert the weight from kilograms to pounds (1 kg = 2.2 pounds)
        double p = w / 2.2;

        // Print the weight in both pounds and kilograms
        System.out.println("The weight of the person in pound is " + p + " and in kg is " + w);
    }
}