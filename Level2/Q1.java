import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter First number: ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter Second number: ");
        int number2 = sc.nextInt();

        // Calculate the quotient of the two numbers
        int quotient = number1 / number2;

        // Calculate the remainder of the two numbers
        int reminder = number1 % number2;

        // Print the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
    }
}