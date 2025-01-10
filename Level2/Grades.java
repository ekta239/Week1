import java.util.Scanner;

/**
 * This class calculates the grade and remarks based on the marks obtained in three subjects.
 */
public class Grades {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter marks in Physics, Chemistry, and Maths
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        // Calculate the total marks and percentage
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;

        // Initialize variables to store the grade and remarks
        String grade, remarks;

        // Determine the grade and remarks based on the percentage
        if (percentage >= 80) {
            // Grade A: above agency-normalized standards
            grade = "A";
            remarks = "Level=4,above agency-normalized standards";
        } else if (percentage >= 70) {
            // Grade B: at agency-normalized standards
            grade = "B";
            remarks = "Level=3,at agency-normalized standards";
        } else if (percentage >= 60) {
            // Grade C: below, but approaching agency-normalized standards
            grade = "C";
            remarks = "Level=2,Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            // Grade D: well below agency-normalized standards
            grade = "D";
            remarks = "Level=1,Well below agency-normalized standards";
        } else if (percentage >= 40) {
            // Grade E: too below agency-normalized standards
            grade = "E";
            remarks = "Level=1,too below agency-normalized standards";
        } else {
            // Grade R: remedial standards
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the percentage, grade, and remarks
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Level: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}