import java.util.Scanner;

public class is_x_present {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the count of numbers:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println("enter the x number:");
        int x = s.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(a[i] == x){
                found = true;
                break; // no need to check further
            }
        }

        if(found){
            System.out.println("X is present");
        } else {
            System.out.println("X is not present");
        }
    }
}
