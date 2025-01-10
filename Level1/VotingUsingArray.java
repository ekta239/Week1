import java.util.Scanner;

public class VotingUsingArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Initialize an array to store the ages of 10 students
        int[] age = new int[10];

        // Prompt the user to enter the ages of the students
        System.out.print("Enter Student's Age: ");

        // Read the ages of the students from the user and store them in the array
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        // Iterate through the array and check if each student is eligible to vote
        for (int i = 0; i < age.length; i++) {
            // Check if the student's age is 18 or more
            if (age[i] >= 18) 
                // If the student is eligible to vote, print a message
                System.out.println("The student with the age " + age[i] + " can vote.");
            // Check if the student's age is less than or equal to 0
            else if (age[i] <= 0) 
                // If the age is invalid, print an error message
                System.out.println("An invalid age.");
            // If the student is not eligible to vote, print a message
            else 
                System.out.println("The student with the age " + age[i] + " cannot vote.");
        }
    }
}