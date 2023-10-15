/*
 54321
 4321
 321
 21
 1
 */


import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for ( i=rows; i>0; i-- )
        {
            for( j=i; j>0; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
