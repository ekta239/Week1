import java.util.Scanner;

/**
 * This class calculates the total income by adding salary and bonus.
 */
public class SalaryBonus {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter salary amount
        System.out.print("Enter salary amount: ");
        double salary = sc.nextDouble();

        // Prompt user to enter bonus amount
        System.out.print("Enter bonus amount: ");
        double bonus = sc.nextDouble();

        // Calculate total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}