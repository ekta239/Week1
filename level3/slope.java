public class slope {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        System.out.print("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y3: ");
        int y3 = scanner.nextInt();

        // Check if points are collinear using slope formula
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope formula");
        } else {
            System.out.println("Points are not collinear using slope formula");
        }

        // Check if points are collinear using area of triangle formula
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area of triangle formula");
        } else {
            System.out.println("Points are not collinear using area of triangle formula");
        }
    }

    // Method to find if three points are collinear using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Check if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to calculate slope between two points
    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        // Check for division by zero
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY; // Return infinity if denominator is zero
        }
        return (double) (y2 - y1) / (x2 - x1);
    }

    // Method to find if three points are collinear using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate area
        double area = calculateArea(x1, y1, x2, y2, x3, y3);

        // Check if area is zero
        return area == 0;
    }

    // Method to calculate area of triangle
    public static double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
}