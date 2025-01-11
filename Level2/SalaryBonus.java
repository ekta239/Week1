import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        // Define arrays to store salary, years of service, new salary, and bonus
        double[][] employeeData = new double[10][2];
        double[][] bonusData = new double[10][2];

        // Define variables to store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
                    System.out.print("Enter salary for employee " +  ": ");
                    employeeData[i][0] = scanner.nextDouble();
                    System.out.print("Enter years of service for employee " +  ": ");
                    employeeData[i][1] = scanner.nextDouble();               
        }

        // Loop to calculate the bonus of 10 employees based on their years of service
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (employeeData[i][1] > 5) {
                bonus = employeeData[i][0] * 0.05;
            } else {
                bonus = employeeData[i][0] * 0.02;
            }
            bonusData[i][0] = employeeData[i][0] + bonus; // New salary
            bonusData[i][1] = bonus; // Bonus amount
            totalBonus += bonus;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][0];
        }

        // Print the total bonus payout as well as the total old and new salary of all the employees
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Print the old salary, bonus, and new salary for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + employeeData[i][0]);
            System.out.println("Bonus: " + bonusData[i][1]);
            System.out.println("New Salary: " + bonusData[i][0]);
            System.out.println();
        }
    }
}
