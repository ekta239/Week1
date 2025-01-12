public class numcompare {
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Initialize an array to store 5 numbers.
        int[] numbers = new int[5];

        // Prompt the user to enter 5 numbers.
        System.out.println("Enter 5 numbers:");
        
        // Read 5 numbers from the user and store them in the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Iterate through the array and check each number.
        for (int i = 0; i < numbers.length; i++) {
            // Check if the number is positive.
            if (isPositive(numbers[i])) {
                // Check if the number is even.
                if (isEven(numbers[i])) {
                    // Print a message if the number is positive and even.
                    System.out.println(numbers[i] + " is a positive even number.");
                } else {
                    // Print a message if the number is positive and odd.
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            } else {
                // Print a message if the number is negative.
                System.out.println(numbers[i] + " is a negative number.");
            }
        }

        // Compare the first and last numbers in the array.
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        
        // Print the result of the comparison.
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }

   
    public static boolean isPositive(int number) {
        return number > 0;
    }

   
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

   
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}