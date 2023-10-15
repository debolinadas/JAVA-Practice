
/*
 12345
 1234
 123
 12
 1
 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for ( i=1; i<=rows; i++ )
        {
            for( j=rows; j>=i; j--)
            {
                System.out.print(i);
            }   
            System.out.println();
        }

    }
}
