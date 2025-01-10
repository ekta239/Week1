import java.util.Scanner;

/**
 * This class represents a simple voting system.
 */
public class Voting {
    // The main method where the program starts execution.
     
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their age.
        System.out.print("Enter Age of person: ");

        // Read the age from the user.
        int age = sc.nextInt();

        // Check if the person is eligible to vote (i.e., their age is 18 or more).
        if (age >= 18) {
            // If the person is eligible, print a message indicating they can vote.
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the person is not eligible, print a message indicating they cannot vote.
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}