import java.util.Scanner;
public class handshake{
    public static int countHandshakes(int n) {
        return n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = scanner.nextInt();
        int handshakes = countHandshakes(n);
        System.out.println("The number of handshakes among " + n + " people is: " + handshakes);
    }
}