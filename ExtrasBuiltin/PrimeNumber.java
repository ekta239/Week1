public class PrimeNumber {
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if the number is less than 2, in which case it's not prime
        if (number < 2) {
            return false;
        }
        
        // Check if the number is 2, in which case it's prime
        if (number == 2) {
            return true;
        }
        
        // Check if the number is even, in which case it's not prime
        if (number % 2 == 0) {
            return false;
        }
        
        // Check odd factors up to the square root of the number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        // If no factors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Test the isPrime function
        System.out.println(isPrime(25));  // false
        System.out.println(isPrime(23));  // true
        System.out.println(isPrime(37));  // true
        System.out.println(isPrime(48));  // false
    }
}