import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        int n = str.length();
        String rev = "";
        for (int i = n-1 ; i >= 0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        System.out.println("reverse string: "+rev);
    }
}
