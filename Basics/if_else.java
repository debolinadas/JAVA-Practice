public class if_else {
    public static void main(String[] args)
    {
        int n = 6;

        // Odd - Even problem
        if( n%2 == 0)
            System.out.println("The number " + n + " is even");
        else
            System.out.println("The number " + n + " is odd");

        //Ternary operator
        int m = 1;
        m = n > 10 ? 50 : 100;
        System.out.println(m);

        //switch - case 
        //switch case doesnt work with double data type
        //java compiler above 1.7 works with string data type for switch cases
        //char is also a commonly used data type in switch cases
        int a = 4 ;
        switch(a)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
    }
}
