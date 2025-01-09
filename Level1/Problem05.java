public class Problem05 {
    public static void main(String[] args) {
        // Define the number of pens and students
        int pens = 14, stu = 3; // Number of pens and students
        
        // Calculate the number of pens each student can get
        int pensPerStu = pens / stu; // Integer division to get the whole number of pens per student
        int remainder = pens % stu; // Calculate the remaining pens that cannot be evenly distributed
        System.out.println("The Pen Per Student is "+pensPerStu+" and the remaining pen not distributed is "+remainder);
    }
}