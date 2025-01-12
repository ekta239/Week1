import java.util.Scanner;

public class trigno {
   
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double angleInRadians = Math.toRadians(angle);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[] {sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        double result[]= calculateTrigonometricFunctions(angle);
        System.out.println("Sine of " + angle + " degrees: " + result[0]);
        System.out.println("Cosine of " + angle + " degrees: " + result[1]);
        System.out.println("Tangent of " + angle + " degrees: " + result[2]);
    }
}