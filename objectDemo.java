
//Creating a class    
class Calc
{
    int num1 , num2 ;
    int res; //instance variable

    //method declared to perform some operations by the object
    public int perform(int extra, int prod ) //local variable
    {
        res = (num1 + num2 + extra) * prod;
        if( res > 50 )
            return 1;
        else
            return 0;
    }
    
}

public class objectDemo 
{
    
    public static void main(String[] args) 
    {
        Calc obj = new Calc();  ; //reference
        //new keyword allocates memory for the object and Calc() is a constructor

        obj.num1 = 5;
        obj.num2 = 2;

        obj.perform(5, 1);//Calling the method
        System.out.println(obj.res);
    }
}
