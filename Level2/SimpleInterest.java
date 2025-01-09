import java.util.Scanner;

/**
 * This class calculates the simple interest based on the principal, rate, and time.
 */
public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        // Prompt the user to enter the time period
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        // Calculate the simple interest using the formula: (p * r * t) / 100
        double SI = p * r * t / 100;

        // Display the calculated simple interest
        System.out.print("The Simple Interest is " + SI + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}