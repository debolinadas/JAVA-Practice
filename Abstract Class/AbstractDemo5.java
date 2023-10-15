

abstract class Base{
    final void fun()
    {
        System.out.println("Coding is fun");
    }
}

class Derived extends Base{

}

public class AbstractDemo5 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
