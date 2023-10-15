
/*
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j,k;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for(i=rows; i>0; i--)
        {
            for(j=i; j<rows; j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
