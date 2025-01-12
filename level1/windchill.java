import java.util.Scanner;


public class windchill {

   
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Calculate the wind chill index
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for temperature
        System.out.print("Enter temperature in Fahrenheit (between -459.67 and 1000): ");
        double temperature = scanner.nextDouble();

        // Prompt the user for wind speed
        System.out.print("Enter wind speed in miles per hour (between 0 and 150): ");
        double windSpeed = scanner.nextDouble();

        // Calculate the wind chill index
        double windChill = calculateWindChill(temperature, windSpeed);

        // Print the result
        System.out.printf("The wind chill index is %.2f\n", windChill);
    }
}