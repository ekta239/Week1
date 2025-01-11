public class Bmi {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Initialize arrays to store weight, height, BMI, and status of each person
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Loop through each person to input their weight and height
        for (int i = 0; i < n; i++) {
            // Prompt the user to enter the weight of the current person
            System.out.print("Enter the weight of person " + (i + 1) + " in kg: ");
            weight[i] = scanner.nextDouble();

            // Prompt the user to enter the height of the current person
            System.out.print("Enter the height of person " + (i + 1) + " in meters: ");
            height[i] = scanner.nextDouble();
        }

        // Loop through each person to calculate their BMI and status
        for (int i = 0; i < n; i++) {
            // Calculate the BMI using the formula: weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the status based on the BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Print the header for the output table
        System.out.println("Height\tWeight\tBMI\tStatus");

        // Loop through each person to print their details
        for (int i = 0; i < n; i++) {
            // Print the height, weight, BMI, and status of the current person
            System.out.println(height[i] + "\t" + weight[i] + "\t" + String.format("%.2f", bmi[i]) + "\t" + status[i]);
        }
    }
}