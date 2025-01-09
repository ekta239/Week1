import java.util.Scanner;

/**
 * This class calculates the area of a triangle in both centimeters and inches.
 */
public class Problem12 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter base: ");
        double base = sc.nextInt();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter height: ");
        double height = sc.nextInt();

        // Calculate the area of the triangle using the formula: area = 0.5 * base * height
        double area = 0.5 * base * height;

        // Convert the area from square centimeters to square inches (1 inch = 2.54 cm)
        double inch = area / 2.54;

        // Print the calculated area in both centimeters and inches
        System.out.print("The area of triangle in cm is " + area + " while in inches is " + inch);
    }
}