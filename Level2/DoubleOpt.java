import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter values for a, b, and c
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        Double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        Double c = sc.nextDouble();

        // Perform arithmetic operations
        Double w = a + b * c; // addition and multiplication
        Double x = a * b + c; // multiplication and addition
        Double y = c + a / b; // division and addition
        Double z = a % b + c; // modulus and addition

        // Print the results of the operations
        System.out.print("The results of Double Operations are " + w + ", " + x + ", " + y + " and " + z);
    }
}