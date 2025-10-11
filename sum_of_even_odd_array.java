import java.util.Scanner;

public class sum_of_even_odd_array {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int sum_even =0;
        int sum_odd =0;
        for(int i=0;i<n;i++){
        if(a[i] % 2 ==0){
            sum_even += a[i];
        }
        else{
            sum_odd += a[i];
        }
    }
    System.out.println("even count:"+sum_even);
        System.out.println("odd count:"+sum_odd);
    }
}