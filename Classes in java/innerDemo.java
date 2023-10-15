
class Outer
{
    int a;                  //Member Variable    
    public void show()      //Member Method
    {
        System.out.println("Out Display");
    }

    class Inner             //Member Class
    {
        public void display()
        {
            System.out.println("In Display");
        }
    }

    static class InnerDemo             //Member Class
    {
        public void display()
        {
            System.out.println("In Display");
        }
    }
}

public class innerDemo 
{
    //Inside a class we can create a variable, method, class
    public static void main(String[] args) 
    {
        Outer obj = new Outer();
        obj.show();

        //To call a member class
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();

        Outer.InnerDemo obj2 = new Outer.InnerDemo();
        obj2.display();
    }
    
}
