import java.util.Scanner;

public class secondary_diagonal {

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
        System.out.print("secondary diagonal:");
        for(int i=0;i<rows;i++){
            // for(int j=cols-i-1;j>=0;j--){
            
                System.out.print(a[i][cols-1-i]+" ");
            }
        }
            
        }

//     }
// }
