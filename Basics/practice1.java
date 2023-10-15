import java.util.*;
public class practice1 {
    public static void main(String[] args)
    {
        //Wap to find the largest of 2 and 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        if( p>q && p>r )
            System.out.println(p + " is the largest.");
        else if( q>p && q>r )
            System.out.println(q + " is the largest.");
        else
            System.out.println(r + " is the largest.");

        //find the largest of two numbers
        int a = p>q ? p:q;
        System.out.println(a + " is the largest.");

        //program to check even or odd number 
        System.out.println("Enter the number to check odd or even : ");
        int n = sc.nextInt();
        String s = ( n%2 == 0 )? "even":"odd";
        System.out.println(s);

        //wap to check for leap year
        System.out.println("Enter the year to be checked : ");
        int y = sc.nextInt();
        if((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0))
        {
            System.out.println(y + " is a leap year.");
        }
        else
        {
            System.out.println(y + " is a not leap year.");
        }
        sc.close();
    }
}
