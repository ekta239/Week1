public class digitinint {
    public static void main(String[] args) {
        // Get an integer input for the number variable
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Create an integer variable count with value 0
        int count = 0;

        // Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove the last digit from number in each iteration
            number = number / 10;
            // Increase count by 1 in each iteration
            count++;
        }

        // Finally display the count to show the number of digits
        System.out.println("Number of digits: " + count);
    }
}