
/*
 1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */


import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j,c=1;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for ( i=1; i<=rows; i++ )
        {
            for( j=1; j<=i; j++ )
            {
                System.out.print(c+" ");
                c++;
            }   
            System.out.println();
        }

    }
}
