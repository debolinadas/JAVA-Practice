//   PASCAL'S TRIANGLE
/*
       1 
      1 1 
     1 2 1 
    1 3 3 1 
   1 4 6 4 1 
  1 5 10 10 5 1 
 1 6 15 20 15 6 1 

 */

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        int sp = n;
        int number = 1;

        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            number = 1;
            for(int k=0; k<=i; k++)
            {
                System.out.print(number + " ");
                number = number * (i-k)/(k+1);
            }
            sp--;
            System.out.println();
        }
        sc.close();
    }
}
