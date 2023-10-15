public class iteration {
    public static void main(String[] args)
    {
        //repeating code = Code redundancy
        //while, do-while, for, for-each
        
        //while loop
        int i = 1; //Initializing the value of i
        while( i <= 5 )
        {
            System.out.println("Hello");
            i++; //Incrementing the value of i
        }
        //while(true) - Infinite loop

        //when we want our loop to execute at least once 
        //even if the condition is false
        //a do-while loop is used 
        int j = 9;
        do
        {
            System.out.println("Bye");
            j++;
        }while(j <= 5);

        //for loop structure
        //starting and ending points are known
        for (i=1 ; i<=6 ; i++)
        {
            System.out.println("DD");
        }

        //for-each loop are specially built for arrays
    }
}
