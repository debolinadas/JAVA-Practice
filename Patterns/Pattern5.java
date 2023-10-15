
/*
 55555
 4444
 333
 22
 1
 */


import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j,c=1;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for ( i=rows; i>0; i-- )
        {
            for( j=rows-i; j>0; j-- )
            {
                System.out.print(" ");
            }  
            for(int k=i;k>0;k--)
            {
                System.out.print(c);
                c++;
            } 
            System.out.println();
        }

    }
}
