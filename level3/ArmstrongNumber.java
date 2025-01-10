import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Get an integer input and store it in the number variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
        int sum = 0;
        int originalNumber = number;

        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // In the while loop find the reminder number by using the modulus operator as in  number % 10
            int remainder = originalNumber % 10;

            // Find the cube of the number and add it to the sum variable
            sum = sum + (remainder * remainder * remainder);

            // Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression
            originalNumber = originalNumber / 10;
        }

        // Finally check if the number and the sum are the same, if same its an Armstrong number else not
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
