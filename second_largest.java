// import java.util.Arrays;
import java.util.Scanner;

public class second_largest {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        // Arrays.sort(a);
        // if(n < 2) {
        //     System.out.println("Not enough elements to find second largest");
        // } 
        // else if(a[n-1] == a[n-2]) {
        //     System.out.println("No distinct second largest (elements may be same)");
        // } 
        // else {
        //     System.out.println("Second largest: " + a[n-2]);
        // }
    // System.out.println("Second largest:"+a[1]);

    int first = Integer.MIN_VALUE;
    int second =Integer.MIN_VALUE;;
    for(int i=0;i<n;i++){
        if(first<a[i]){
            second = first;
            first = a[i];
        }
        else if(a[i] > second && a[i] < first){
            second = a[i];
        }
    }
        if(second==Integer.MIN_VALUE){
            System.out.print("there is no distinct element");
        }
        else{
            System.out.println("Second largest:"+second);
        }
    }
    }
