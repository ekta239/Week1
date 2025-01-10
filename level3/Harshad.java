public class Harshad {
    public static void main(String[] args) {
        // Get an integer input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Initialize sum to 0
        int sum = 0;

        // Store the original number
        int originalNumber = number;

        // Create a while loop to access each digit of the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Add the digit to sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the number is perfectly divisible by the sum
        if (originalNumber % sum == 0) {
            // If the number is divisible by the sum, print Harshad Number
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            // Otherwise, print Not a Harshad Number
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}