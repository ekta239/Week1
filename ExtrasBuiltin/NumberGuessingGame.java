public class NumberGuessingGame {
    // Minimum and maximum range for the number to be guessed
    private int min;
    // Maximum range for the number to be guessed
    private int max;
    // Number of attempts taken to guess the number
    private int attempts;

    // Constructor to initialize the game with a range
    public NumberGuessingGame(int min, int max) {
        this.min = min;
        this.max = max;
        // Initialize attempts to 0
        this.attempts = 0;
    }

    // Method to generate a random guess within the range
    public int generateGuess() {
        // Generate a random number between min and max (inclusive)
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Method to get user feedback on the guess
    public String getUserFeedback(int guess) {
        // Prompt the user for feedback (h - higher, l - lower, c - correct)
        System.out.println("Is your number " + guess + "? (h/l/c)");
        // Read the user's feedback
        return System.console().readLine();
    }

    // Method to play the number guessing game
    public void play() {
        int guess; // Current guess
        String feedback; // User feedback on the guess
        do {
            // Generate a new guess
            guess = generateGuess();
            // Get user feedback on the guess
            feedback = getUserFeedback(guess);
            // Increment the number of attempts
            attempts++;
            // Update the range based on user feedback
            if (feedback.equals("h")) {
                // If the guess is too low, update the minimum range
                max = guess - 1;
            } else if (feedback.equals("l")) {
                // If the guess is too high, update the maximum range
                min = guess + 1;
            }
        } while (!feedback.equals("c")); // Continue until the correct guess
        // Display the result
        System.out.println("Yay! I guessed your number in " + attempts + " attempts.");
    }

    // Main method to start the game
    public static void main(String[] args) {
        // Create a new game with a range of 1 to 100
        NumberGuessingGame game = new NumberGuessingGame(1, 100);
        // Start the game
        game.play();
    }
}