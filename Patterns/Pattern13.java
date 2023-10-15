
/*
 ***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 */

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k,n,l;
        System.out.println("Enter the number of rows : ");
        n = sc.nextInt();

        for(i=n; i>0; i--)
        {
            for(j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(l=1;l<=i-1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
