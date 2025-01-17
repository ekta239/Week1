    public class NullPointerExceptionDemo {
        //  Main method to demonstrate NullPointerException handling.
         
        public static void main(String[] args) {
            // Generate a NullPointerException
            generateNullPointerException();
            
            // Handle a NullPointerException
            handleNullPointerException();
        }

        /**
         * Method to generate a NullPointerException.
         */
        public static void generateNullPointerException() {
            // Initialize a null string
            String text = null;
            
            try {
                // Attempt to access the length of the null string
                System.out.println(text.length());
            } catch (NullPointerException e) {
                // Catch and handle the NullPointerException
                System.out.println("NullPointerException caught in generateNullPointerException method");
            }
        }

        /**
         * Method to handle a NullPointerException.
         */
        public static void handleNullPointerException() {
            // Initialize a null string
            String text = null;
            
            try {
                // Attempt to access the length of the null string
                System.out.println(text.length());
            } catch (NullPointerException e) {
                // Catch and handle the NullPointerException
                System.out.println("NullPointerException caught in handleNullPointerException method");
                
                // Rethrow the exception as a RuntimeException
                throw new RuntimeException("NullPointerException occurred while accessing string method", e);
            }
        }
    }