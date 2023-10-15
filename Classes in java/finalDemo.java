

class A
{
    final int i=0;  // When we declare a variable as final , it becomes a constant
    public A()
    {
        System.out.println(i);
    }
}


public class finalDemo 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        System.out.println(obj.i);
        
    }
    
}
