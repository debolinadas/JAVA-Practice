/*
1234
1234
1234
1234
 */
import java.util.*;

public class Pattern2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols,i,j;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        cols = sc.nextInt();

        for ( i=1; i<=rows; i++ )
        {
            for( j=1; j<=cols; j++ )
            {
                System.out.print(j);
            }   
            System.out.println();
        }
    }
    
}
