
//The three dots will declare n to be an array
class Sum
{
    public int added(int ... n)//array - variable length arguments 
    {
        int sum = 0;
        for(int i : n)
        {
            sum = sum + i;
        }
        return sum;
    }
}


public class VarArguments 
{
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.added(6,3,2));
    }
    
}
