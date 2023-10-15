
/*
 1
 12
 123
 1234
 12345
 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for ( i=1; i<=rows; i++ )
        {
            for( j=1; j<=i; j++ )
            {
                System.out.print(i);
            }   
            System.out.println();
        }

    }
    
}
