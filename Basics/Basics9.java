import java.util.*;

public class Basics9 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int num, r, sum=0;
        num = sc.nextInt();
        int sq = num*num;
        sc.close();
        while(sq != 0 )
        {
            r = sq%10;
            sum = sum + r;
            sq = sq/10;
        }

        if(sum == num)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a Neon number");
            
        }
    }
    
}
