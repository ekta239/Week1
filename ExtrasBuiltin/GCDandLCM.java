public class GCDandLCM {

    // Method to calculate the Greatest Common Divisor (GCD) of two numbers using recursion
    public static int calculateGCD(int num1, int num2) {
        // Base case: if the second number is 0, return the first number
        if (num2 == 0) {
            return num1;
        }
        // Recursive case: call the method with the second number and the remainder of the first number divided by the second number
        return calculateGCD(num2, num1 % num2);
    }

    // Method to calculate the Least Common Multiple (LCM) of two numbers
    public static int calculateLCM(int num1, int num2) {
        // Calculate the LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (num1 * num2) / calculateGCD(num1, num2);
    }

    // Main method to test the GCD and LCM methods
    public static void main(String[] args) {
        // Define two numbers
        int num1 = 12;
        int num2 = 15;
        // Calculate the GCD and LCM of the two numbers
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        // Print the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}