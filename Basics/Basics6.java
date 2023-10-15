//Java Program to display all prime numbers from 1 to n

import java.util.Scanner;

public class Basics6 {
    static int checkPrime(int num)
    {
        if(num < 2)
        {
            return 0;
        }
        else
        {
            int x = num/2;
            for(int i=2; i<x; i++)
            {
                if(num % i == 0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the lower and upper bound : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Prime numbers in the range : ");
        for(int i=a; i<=b; i++)
        {
            if(checkPrime(i) == 1)
            {
                System.out.println(i);

            }
        }
        sc.close();
    }
    
}
