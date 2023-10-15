
/*
 1
 22
 333
 4444
 55555
 */


import java.util.Scanner;

public class Pattern4 {
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
