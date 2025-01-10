import java.util.Scanner;

// Calculator class to perform basic arithmetic operations
public class calculator {
    // Main method to execute the calculator program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter first number:");
        double first = scanner.nextDouble();

        // Prompt user to enter the operator (+, -, *, /)
        System.out.println("Enter operator (+, -, *, /):");
        String op = scanner.next();

        // Prompt user to enter the second number
        System.out.println("Enter second number:");
        double second = scanner.nextDouble();

        // Use a switch statement to perform the operation based on the operator
        switch (op) {
            case "+":
                // Perform addition and print the result
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // Perform subtraction and print the result
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // Perform multiplication and print the result
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    // Perform division and print the result
                    System.out.println("Result: " + (first / second));
                } else {
                    // Print an error message for division by zero
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                // Print an error message for invalid operator
                System.out.println("Invalid Operator");
        }
    }
}