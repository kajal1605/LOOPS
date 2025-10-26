import java.util.Scanner;

public class col_sum_2d {
 public static void main(String[] args) {
        // to take the input from the system
        Scanner s = new Scanner(System.in);
        // taken a variable to get the value from the user
        System.out.print("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = s.nextInt();

        int[][] a = new int[rows][cols];

        // input
        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = s.nextInt();
            }
        }

        //output
        System.out.println("sum:");
           
        for(int j=0;j<cols;j++){
         int sum =0;
            for(int i=0;i<rows;i++){
                sum += a[i][j];
            }
             System.out.println("Sum of the row"+ (j+1) +": "+sum);
        }

    }
}