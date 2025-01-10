import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Check if the first number is the smallest
        if (num1 < num2 && num1 < num3) {
            // Print a message if the first number is the smallest
            System.out.println("Is the first number the smallest? Yes");
        } else {
            // Print a message if the first number is not the smallest
            System.out.println("Is the first number the smallest? No");
        }
    }
}