import java.util.Scanner;

public class even_odd_array {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int even_count =0;
        int odd_count =0;
        for(int i=0;i<n;i++){
        if(a[i] % 2 ==0){
            even_count++;
        }
        else{
            odd_count++;
        }
    }
    System.out.println("even count:"+even_count);
        System.out.println("odd count:"+odd_count);
    }
}
