import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform integer operations
        int w = a + b * c; // addition and multiplication
        int x = a * b + c; // multiplication and addition
        int y = c + a / b; // division and addition
        int z = a % b + c; // modulus and addition

        // Display the results of the integer operations
        System.out.print("The results of Int Operations are " + w + ", " + x + ", " + y + " and " + z);
    }
}