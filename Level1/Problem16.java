import java.util.Scanner;

/**
 * This class calculates the possible number of handshakes among a group of students.
 */
public class Problem16 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the total number of students
        System.out.print("Enter total number of students: ");

        // Read the number of students from the user
        int numberOfStudents = sc.nextInt();

        // Calculate the possible number of handshakes using the formula n*(n-1)/2
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.print("Possible Handshakes: " + numberOfHandshakes);
    }
}