import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.close();
        //Swapping two numbers
        int a = 20, b = 30;
        a = a + b;//a = 50, b = 30
        b = a - b;//a = 50, b = 20
        a = a - b;//a = 30, b = 20
        System.out.println("a = " + a + " b = "+ b);

        //Multiplication table of any number
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i , tab = 1;
        for(i=1 ; i<=10 ; i++)
        {
            tab = n * i;
            System.out.println(n + " *  " + i + "  =  " + tab);
        }

        //Factorial of a number
        System.out.println("Enter the number to calculate the factorial : ");
        int n1 = sc.nextInt();
        int fact = 1, i1;
        for( i1=n1 ; i1>0 ; i1-- )
        {
            fact = fact * i1;
        }
        System.out.println("The factorial of the number is : " + fact);
        
        //Factorial using recursion
        /*int fact = 1;
        int n = 5, res;
        factorial f = new factorial();
        res = f.calfact(n);
        System.out.println(res);

        int calfact(int n)
        {
            if(n>1)
            {
                fact = fact * n;
                calfact(n-1);
                return fact;
            }
        }*/

        
    }
}
