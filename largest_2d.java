import java.util.Scanner;

public class largest_2d {
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
        System.out.print("Largest element in 2D array:");
        int max = Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(max<a[i][j]){
                    max = a[i][j];
            }
        }
    }
    System.out.print(max);
    }
}