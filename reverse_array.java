import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        
        // System.out.println("Reverse");
        // for(int i=n-1;i>=0;i--){
        //     System.out.println(a[i]+" ");
        // }

        // Approach 2:
        int start = 0, end =n-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse");
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
        }
    }
}
