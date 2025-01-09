import java.util.Scanner;

/**
 * This class calculates the number of chocolates each child gets and the remaining chocolates.
 */
public class Chocolates {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of chocolates
        System.out.print("Enter number of chocolates: ");
        int N = sc.nextInt();

        // Prompt the user to enter the number of children
        System.out.print("Enter number of childrens: ");
        int M = sc.nextInt();

        // Calculate the number of chocolates each child gets
        int d = N / M;

        // Calculate the number of remaining chocolates
        int r = N % M;

        // Print the result
        System.out.print("The number of chocolates each child gets is " + d + " and the number of remaining chocolates are " + r);
    }
}