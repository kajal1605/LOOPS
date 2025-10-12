import java.util.Scanner;

public class sum_of_all_elements {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = s.nextInt();
        System.out.println("Enter columns:");
        int cols = s.nextInt();
        int[][] a = new int[rows][cols];

        System.out.println("enter elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = s.nextInt();
            }  
        }
        int sum =0;
        // System.out.println("Matrix:")
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum += a[i][j];
            }  
        }
        System.out.println("Sum of all the elements:"+sum);
    }
}
