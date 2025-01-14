public class vovcons{
    // Method to check if the character is a vowel or consonant
    public static String checkCharacter(char ch){
        // Convert the character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel or consonant
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return "Vowel";
        } else if(ch >= 'a' && ch <= 'z'){
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String str){
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Iterate over each character in the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            // Check if the character is a vowel or consonant
            String result = checkCharacter(ch);
            
            // Increment the count accordingly
            if(result.equals("Vowel")){
                vowelCount++;
            } else if(result.equals("Consonant")){
                consonantCount++;
            }
        }
        
        // Return the count of vowels and consonants in an array
        return new int[]{vowelCount, consonantCount};
    }

    // Main function
    public static void main(String[] args){
        // Take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        // Call the user-defined methods
        int[] result = findVowelsAndConsonants(str);
        
        // Display the result
        System.out.println("Vowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);
    }
}