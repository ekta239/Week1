import java.util.Scanner;
public class SpringSeason {

     public static boolean isSpringSeason(int month, int day) {
        // Spring season starts from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 4 || month == 5) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");  // Months are 1-indexed, so we subtract 1 from month input to match the array index. For example, January is 1, February is 2, etc.
        int day = scanner.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    
   
}