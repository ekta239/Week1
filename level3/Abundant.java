public class Abundant {
    public static void main(String[] args) {
        // Get an integer input for the number variable
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Create an integer variable sum with initial value 0
        int sum = 0;

        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Inside the loop, check if number is divisible by i
            if (number % i == 0) {
                // If true, add i to sum
                sum += i;
            }
        }

        // Outside the loop Check if sum is greater than number
        if (sum > number) {
            // If the sum is greater than the number, print Abundant Number
            System.out.println(number + " is an Abundant Number");
        } else {
            // Otherwise, print Not an Abundant Number
            System.out.println(number + " is Not an Abundant Number");
        }
    }
}