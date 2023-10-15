
abstract class B{
    abstract class C{
        abstract void myDay();
    }
}

class D extends B{
    class E extends C{
        void myDay()
        {
            System.out.println("Implementing the extended inner class.");
        }
    }
}

public class AbstractDemo3 {
    public static void main(String[] args) {
        D outer = new D();
        D.E inner = outer.new E();
        inner.myDay();
    }
}
