import java.util.*;
public class print_2D_array {
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
        System.out.println("Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");
            }  
            System.out.println();
        }
    }
}