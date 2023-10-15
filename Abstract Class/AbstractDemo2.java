/*
 If the Child class is unable to provide implementation to all abstract methods of the Parent class 
 then we should declare that Child class as abstract so that the next level Child class 
 should provide implementation to the remaining abstract method.
 */
abstract class Demo{
    abstract void d1();
    abstract void d2();
    abstract void d3();
}

abstract class FirstChild extends Demo{
    public void d1(){
        System.out.println("D1 is the first child of Demo");
    }
}

class SecondChild extends FirstChild{
    public void d2()
    {
        System.out.println("D2 is the second child of Demo");
    }
    public void d3()
    {
        System.out.println("D3 is the third child of Demo");
    }
}


public class AbstractDemo2 {
    public static void main(String[] args) {
        SecondChild s = new SecondChild();
        s.d1();
        s.d2();
        s.d3();
    }
}
