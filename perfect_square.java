package LOOPS;

import java.util.Scanner;

public class perfect_square {
    static  int square(int n){
    int num = (int)Math.sqrt(n);
    if(num * num == n){
        return 1;
    }
    return 0;
    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Enter the number: ");
        int n = s.nextInt();
       
        System.out.println(square(n));
    }
    
}

    

