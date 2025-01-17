public class factorial {
    // Entry point of the program
    public static void main(String[] args) {
        // Read the input number from the user
        int number = readInput();
        
        // Calculate the factorial of the input number
        long factorial = calculateFactorial(number);
        
        // Print the result to the console
        printOutput(number, factorial);
    }

    // Method to read an integer input from the user
    private static int readInput() {
        // Create a new Scanner object to read from System.in
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Return the user's input as an integer
        return scanner.nextInt();
    }

    // Method to calculate the factorial of a given number
    private static long calculateFactorial(int number) {
        // Factorial is not defined for negative numbers
        if (number < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        } 
        // Base case: factorial of 0 or 1 is 1
        else if (number == 0 || number == 1) {
            return 1;
        } 
        // Recursive case: n! = n * (n-1)!
        else {
            return number * calculateFactorial(number - 1);
        }
    }

    // Method to print the factorial result to the console
    private static void printOutput(int number, long factorial) {
        // Print the result in the format "Factorial of X is Y"
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}