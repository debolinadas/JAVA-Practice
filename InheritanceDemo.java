
/* "extends" keyword is used to implement inheritance */

class Diff // Super Class, base
{
    public int sub(int a, int b)
    {
        return a-b;
    }
}

class Div extends Diff //subclass, derived
{
    public int div(int a,int b)
    {
        return a/b;
    }
}


public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        Div obj = new Div();
        int result = obj.sub(32, 28);
        int result2 = obj.div(16, 8);
        System.out.println(result);
        System.out.println(result2);
    }
    
}
