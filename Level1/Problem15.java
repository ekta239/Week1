import java.util.Scanner;

/**
 * This class calculates the total purchase price of an item based on its unit price and quantity.
 */
public class Problem15 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the Unit price of an item: ");
        float unitPrice = sc.nextFloat();

        // Prompt the user to enter the quantity of the item
        System.out.print("Enter the quantity: ");
        float quantity = sc.nextFloat();

        // Calculate the total purchase price
        float total_price = unitPrice * quantity;

        // Display the total purchase price
        System.out.print(" The total purchase price is INR " + total_price + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}