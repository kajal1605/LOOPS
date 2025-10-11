import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Largest number:"+max);
    }
}
