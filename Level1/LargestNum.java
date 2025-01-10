import java.util.Scanner;

public class LargestNum {
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

        // Determine which number is the largest
        if (num1 > num2 && num1 > num3) {
            // Print the results if the first number is the largest
            System.out.println("Is the first number the largest? Yes\nIs the second number the largest? No\nIs the third number the largest? No");
        } else if (num2 > num1 && num2 > num3) {
            // Print the results if the second number is the largest
            System.out.println("Is the first number the largest? No\nIs the second number the largest? Yes\nIs the third number the largest? No");
        } else {
            // Print the results if the third number is the largest
            System.out.println("Is the first number the largest? No\nIs the second number the largest? No\nIs the third number the largest? Yes");
        }
    }
}