/*
 Similar to the interface we can define static methods in an abstract class that 
 can be called independently without an object. 
 */

abstract class Egg{
    static void Yolk()
    {
        System.out.println("I love the yolk of egg");
    }
}

public class AbstractDemo4 {
    public static void main(String[] args) {
        Egg.Yolk();
    }
}
