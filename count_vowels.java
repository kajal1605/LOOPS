import java.util.Scanner;

public class count_vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        int n = str.length();
        
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
