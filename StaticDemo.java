/* 
 * To prevent any variable from being object specific ,
 * We use the "static" keyword
 * Instead of going to the heap memory, it will go to the class loader memory
 * The value will be same for all the object
 * to access the static variables we dont need object
 * Cant access a non-static variable into a static block
 */



class Emp
{
    int eid;
    int salary;
    static String ceo;

    public void show()
    {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }

    //To initialize a static variable , it has to be declared in static block
    static          //executed while loading a class
    {
        ceo = "Larry";
    }

    /*  default constructor will assign 
        default values when the object fails to assign its own value*/
    public Emp()    //executed while loading an object
    {
        eid = 10;
        salary = 8900;
    }
}



public class StaticDemo 
{
    public static void main(String[] args) 
    {
        Emp navin = new Emp();
        navin.eid = 5;
        navin.salary = 10000;
        Emp.ceo = "Ram"; //When declared static, the class name can be used to call the method
        navin.show();

        Emp debo = new Emp();
        debo.eid = 2;
        debo.salary = 20000;
        Emp.ceo = "Ram";
        debo.show();
    }
    
}
