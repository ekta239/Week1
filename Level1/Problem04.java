public class Problem04 {
    public static void main(String[] args) {
        // Define the cost price and selling price
        double cp = 129, sp = 191;
        
        // Calculate the profit
        double p = sp - cp;
        
        // Calculate the profit percentage
        double p_per = p / cp * 100;
        
        // Print the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\n" + "The Profit is INR  " + p + "  and the Profit Percentage is " + p_per);
    }
}