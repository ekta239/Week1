import java.util.Scanner;

public class SI {

public static double SI(double p,double r,double t){
	return p*r*t/100;

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Principal, Rate, and Time values
        System.out.println("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the Time in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = SI(principal,rate,time);

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +", Rate of Interest " + rate + " and Time " + time);
    }
}
