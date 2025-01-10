import java.util.Scanner;

/**
 * This class calculates the bonus amount for an employee based on their years of service.
 */
public class Bonus {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their salary
        System.out.print("Salary of Employee: ");
        double salary = sc.nextDouble();

        // Prompt the user to enter their years of service
        System.out.print("Year of Service: ");
        double year = sc.nextDouble();

        // Check if the employee is eligible for a bonus (more than 5 years of service)
        if (year > 5) {
            // Calculate the bonus amount (5% of the salary)
            double bonus_amount = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus_amount);
        } else {
            // If the employee is not eligible, display a message
            System.out.println("No Bonus");
        }
    }
}