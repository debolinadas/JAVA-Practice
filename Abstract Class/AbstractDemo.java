
/* Abstract Class
 * when we dont want to define a method ,we can declare it as abstract.
 * an abstract method must be defined within abstract class
 * If a class extends the abstract class then it should define the abstract method that is declared within that abstract class
 * 
 * Why do we need abstract class ?
 * 
 */

class Printer
{
    public void show(Integer i)
    {
        System.out.println(i);
    }
}
abstract class Human
{
    public abstract void walk();
    public void eat()
    {
        System.out.println("I love to eat.");
    }  
}

class Man extends Human //Concrete class
{
    public void walk()
    {
        System.out.println("sandwiches");
    }
}

public class AbstractDemo 
{
    public static void main(String[] args) 
    {
        Human obj = new Man();
        obj.eat();
        obj.walk();
    }
    
}
