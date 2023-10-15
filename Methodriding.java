
/* class C method show() overrides the method in class D, known as method overriding 
 * Super keyword is used to refer to our parent class object
 */



class D
{
    public void show()
    {
        System.out.println("in D");
    }
}
class C extends D
{
    public void show()
    {
        super.show();
        System.out.println("in C");
    }
}
class E extends D
{
    public void show()
    {
        System.out.println("in E");
    }
}

public class Methodriding 
{
    public static void main(String[] args) {
        D obj = new C(); //Runtime Polymorphism
        obj.show();

        obj = new E(); //Dynamic Method dispatch
        obj.show();
    }
    
}
