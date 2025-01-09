public class Problem06 {
    public static void main(String[] args) {
        // Define the fee and discount percentage
        int fee = 125000, discountPercent = 10;
        
        // Calculate the discount amount
        int discount = fee * discountPercent / 100;
        
        // Calculate the discounted fee
        int discountedFee = fee - discount;
        
        // Print the discount amount and final discounted fee
        System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}