import java.util.Scanner;

/**
 * This class is used to swap two numbers without using a temporary variable.
 */
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Use the XOR operator to swap the numbers
        // The XOR operator has the property that a ^ a = 0 and a ^ 0 = a
        // So, we can use it to swap two numbers without using a temporary variable
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        // Print the swapped numbers
        System.out.print("The swapped numbers are " + number1 + " and " + number2);
    }
}