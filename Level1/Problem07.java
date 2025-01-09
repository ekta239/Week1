public class Problem07 {
    public static void main(String[] args) {
        // Define the radius of the Earth in kilometers
        double radius = 6378;
        
        // Calculate the volume of the Earth in cubic kilometers using the formula (4/3) * π * r^3
        double volume_Km = (4.0 / 3) * 3.14 * radius * radius * radius;
        
        // Convert the volume from cubic kilometers to cubic miles (1 km = 0.621371 miles)
        double volume_Mile = volume_Km * 0.621371 * 0.621371 * 0.621371;
        
        // Print the volumes in both cubic kilometers and cubic miles
        System.out.print("The volume of earth in cubic kilometers is " + volume_Km + " and cubic miles is " + volume_Mile);
    }
}