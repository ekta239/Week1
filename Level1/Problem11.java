import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter First Number: ");
        float number1 = sc.nextFloat();

        // Prompt user to enter the second number
        System.out.print("Enter Second Number: ");
        float number2 = sc.nextFloat();

        // Calculate the sum of the two numbers
        float add = number1 + number2;

        // Calculate the difference of the two numbers
        float sub = number1 - number2;

        // Calculate the product of the two numbers
        float mul = number1 * number2;

        // Calculate the quotient of the two numbers
        float div = number1 / number2;

        // Display the results
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}