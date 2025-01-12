import java.util.Scanner;

/**
 * This class calculates the total number of handshakes that can occur among a group of students.
 */
class Handshakes {
    // Calculates the total number of handshakes that can occur among 'n' students.
     
    public static int students(int n) {
        // Calculate the total number of handshakes using the formula n*(n-1)/2
        return (n * (n - 1)) / 2;
    }

    //The main method that prompts the user to enter the number of students and displays the total number of handshakes.
     
    public static void main(String[] args) {
        // Create a Scanner object to read the user's input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter number of students: ");

        // Read the number of students from the user
        int n = sc.nextInt();

        // Calculate the total number of handshakes
        int result = students(n);

        // Display the total number of handshakes
        System.out.println("Total number of handshakes: " + result);
    }
}