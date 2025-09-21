import java.util.Arrays;
import java.util.Scanner;

public class count_vowels_consonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        int n = str.length();
        
        int count_vowels = 0;
        int count_cons = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count_vowels++;
            }
            else{
                count_cons++;
            }
        }
        int[] arr = new int[2];
        arr[0] = count_vowels;
        arr[1] = count_cons;
        System.out.println("The count of vowels and consonants"+Arrays.toString(arr));
    }
    
}

