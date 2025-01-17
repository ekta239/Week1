public class maxofthree {
    // Function to get three integer inputs from the user
    public static int[] getThreeNumbers() {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(System.console().readLine());
        }
        return numbers;
    }

    // Function to calculate the maximum of three numbers
    public static int calculateMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Main function to execute the program
    public static void main(String[] args) {
        int[] numbers = getThreeNumbers();
        int max = calculateMax(numbers);
        System.out.println("The maximum of the three numbers is: " + max);
    }
}