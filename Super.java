
/*Super Keyword
 * There is a default super() present in the base class which is called automatically
 * By providing arguments to it , it calls the required constructor from base class
*/

class A
{
    public A()
    {
        System.out.println("in A");
    }

    public A(int i)
    {
        System.out.println("in A int");
    }
    public void display()
    {
        System.out.println("good morning");
    }
}

class B extends A
{
    public B()
    {
        super(5);
        System.out.println("in B");
    }

    public B(int i)
    {
        super(i);
        System.out.println("in B int");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}
