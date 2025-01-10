import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.println("Enter numbers: ");

        // Create an array to store the input numbers
        int[] num = new int[5];

        // Read the input numbers from the user
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // Analyze each number in the array
        for (int i = 0; i < num.length; i++) {
            // Check if the number is positive
            if (num[i] > 0) {
                // Check if the number is even
                if (num[i] % 2 == 0) 
                    System.out.println("The " + num[i] + " is positive and even.");
                else 
                    System.out.println("The " + num[i] + " is positive but odd.");
            }

            // Check if the number is zero
            else if (num[i] == 0) 
                System.out.println("The number is zero.");

            // If the number is not positive or zero, it must be negative
            else 
                System.out.println("The " + num[i] + " is negative");
        }

        // Compare the first and last numbers in the array
        if (num[0] == num[4]) 
            System.out.println(num[0] + " is equal to " + num[4]);
        else if (num[0] > num[4])
            System.out.println(num[0] + " is greater than " + num[4]);
        else 
            System.out.println(num[0] + " is less than " + num[4]);
    }
}