/*Java Program to Check Armstrong Number between Two Integers*/

import java.util.Scanner;


public class Basics8 
{
    static int power(int base, int p)
    {
        int pow=1;
        for(int i=1; i<=p; i++)
        {
            pow = base * pow;
        }
        return pow;
    }
    static void Armstrong(int num)
    {
        int c = 0;
        int temp = num;
        while(temp!=0)
        {
            temp=temp/10;
            c++;
        }
        int sum = 0,r;
        int fin = num;
        while(fin!=0)
        {
            r = fin%10;
            sum = sum + power(r,c);
            fin = fin/10;
        }
        if(sum == num)
        {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the lower and upper bound : ");
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i=a+1; i<b; i++)
        {
            Armstrong(i);

        }
        sc.close();
    }
    
}
