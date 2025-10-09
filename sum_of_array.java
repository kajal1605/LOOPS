import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        System.out.println("Sum of the numbers:"+sum);
}
}