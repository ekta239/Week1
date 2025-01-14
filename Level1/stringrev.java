public class stringrev{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = s.nextLine();
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }

}