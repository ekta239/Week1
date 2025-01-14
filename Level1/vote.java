public class vote{
    public static void main(String[] args) {
        int n = 10;
        int[] age = getAge(n);
        String[][] result = checkVote(age);
        displayResult(result);
    }

    // Method to get age of n students
    public static int[] getAge(int n) {
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            age[i] = scanner.nextInt();
        }
        return age;
    }

    // Method to check if a student can vote
    public static String[][] checkVote(int[] age) {
        String[][] result = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                result[i][0] = String.valueOf(age[i]);
                result[i][1] = "Cannot Vote";
            } else if (age[i] >= 18) {
                result[i][0] = String.valueOf(age[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(age[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the result
    public static void displayResult(String[][] result) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
}