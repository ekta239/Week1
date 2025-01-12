import java.util.Scanner;

public class smalllarge {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers.
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int number3 = scanner.nextInt();

        // Call the findSmallestAndLargest method to find the smallest and largest numbers.
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Print the smallest and largest numbers.
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }

    
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Use the Math.min and Math.max methods to find the smallest and largest numbers.
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);

        // Return an array containing the smallest and largest numbers.
        return new int[] { smallest, largest };
    }
}