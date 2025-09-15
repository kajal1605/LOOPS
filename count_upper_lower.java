import java.util.Scanner;

public class count_upper_lower {
    // it will tale
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = s.nextLine();
        int n = str.length();
        int count_upper = 0;
        int count_lower = 0;
        for(int i=0;i<n;i++){
        char ch = str.charAt(i);
        if(ch >= 'A' && ch <='Z'){
            count_upper++;
        }
        else if(ch >= 'a' && ch <= 'z'){
            count_lower++;
        }
        }
        System.out.println("Uppercase letter: "+count_upper+" "+"Lowercase letter: "+count_lower);
    }
    
}
