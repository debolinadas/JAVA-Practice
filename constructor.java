/*        - Constructor is a member method
          - Has the same name as the class name
          - will never return anything, hence no need to mention any return type
          - even if we dont define a constructor they will be present within the class, so they are also called default construcror
          - will be used to allocate memory
*/


class Cal
{
    int num1;
    int num2;
    int result;

    public Cal() //initializing values within a constructor
    {
        num1 = 5;
        num2 = 5;
        System.out.println("in Constructor");
    }

    public Cal(int n) //passing values to the constructor; parametarized constructor
    {
        num1 = n;
        num2 = n;
    }

    public Cal(double d , int n) //passing values to the constructor; parametarized constructor
    {
        num1 = (int) d;
        num2 = n;
    }

    public Cal(int num1, int num2)
    {
        //num1 = num1; - Local variables always shadows the instance variables
        //num2 = num2;
        //This keyword is used to specify the instance variable in case of same variable name
        this.num1 = num1;//represents the current object
        this.num2 = num2;
    }
}

public class constructor {
    public static void main(String[] args) {
        Cal obj = new Cal(9.897, 8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
