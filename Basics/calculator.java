import java.util.Scanner;

public class calculator 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String yn;
        do
        {
            
            System.out.println("Enter first number : ");
            int n1 = s.nextInt();
            System.out.println("Enter second number : ");
            int n2 = s.nextInt();
            System.out.println("Select symbol :- { +, -, *, /}");
            String sym = s.next();
            int res;
            switch(sym)
            {
                case "+" : res = n1+n2;
                           System.out.println("Addition : " + res);
                           break;
                case "-" : res = n1-n2;
                           System.out.println("Subtraction : " + res);
                           break;
                case "*" : res = n1*n2;
                           System.out.println("Multiplication : " + res);
                           break;
                case "/" : res = n1/n2;
                           System.out.println("Division : " + res);
                           break; 
                default : System.out.println("Invalid symbol.");
                          break;
            }
            System.out.println("Do you want to continue ? Press y for Yes and n for No." );
            yn = s.next();
        }while(yn.equals("y")||yn.equals("Y"));
        s.close();
    }
    
}
