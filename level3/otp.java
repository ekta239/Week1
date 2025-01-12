public class otp {
    public static void main(String[] args) {
        // Generate OTP numbers 10 times and save them in an array
        int[] otpNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOtp();
        }

        // Check if all OTP numbers are unique
        if (areOtpNumbersUnique(otpNumbers)) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("All OTP numbers are not unique.");
        }
    }

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOtp() {
        // Generate a random 6-digit number
        int otp = (int) (Math.random() * 900000) + 100000;
        System.out.println("Generated OTP: " + otp);
        return otp;
    }

    // Method to check if all OTP numbers are unique
    public static boolean areOtpNumbersUnique(int[] otpNumbers) {
        // Iterate through the array and check for duplicates
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // No duplicates found
    }
}