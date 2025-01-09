import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner read = new Scanner(System.in);

        // Prompt user to enter the fee amount
        System.out.print("Enter Fee Amount: ");
        int fee = read.nextInt();

        // Prompt user to enter the discount percentage
        System.out.print("Enter Discount Percent: ");
        int discountPercent = read.nextInt();

        // Calculate the discount amount
        int discount = fee * discountPercent / 100;

        // Calculate the discounted fee
        int discountedFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}