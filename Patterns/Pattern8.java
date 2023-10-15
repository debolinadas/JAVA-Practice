
/*
       *
      **
     ***
    ****
   *****
  ******
 *******
*/
import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,i,j, k;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();

        for(i=1; i<rows; i++)
        {
            for(k=rows-i; k>0; k--)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        

    }
    
}
