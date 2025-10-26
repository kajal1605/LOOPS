
import java.util.Scanner;

public class add_2_matrices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = s.nextInt();
        int[][] a = new int[rows][cols];
          int[][] b = new int[rows][cols];
            int[][] c = new int[rows][cols];

        System.out.println("first matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Second matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Addition matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
