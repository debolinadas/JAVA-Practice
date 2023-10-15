
/*
 * Array -> Collection of elements 
 * Every element in an array have a index number which is unique
 * Index numbers in array starts with 0
 * Error caused when the number of elements exceed the limit - ArrayIndexOutOfBounds
 * Array of arrays - Multi-dimensional array
 * Array consisting a collection of elements - Single dimensional array
 * 
 * Enhanced for loop for arrays
 * Single Dimensional array :-
 * a[] = {2,3};
 * for(int k : a)
 * {
 *       System.out.println(k);
 * }
 * 
 * Two-dimensional array
 * for(int k[] : d)
 * {
 *      for(int l : k)
 *      {
 *          System.out.print(" " + l);
 *      }
 *       System.out.println();
 * }
 */

public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        //1d array
        //Declaring an array
        int nums[] = new int[4];
        /* int nums[] = { 5,7,9,11 };*/

        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 9;
        nums[3] = 11;

        for(int i=0; i<4; i++)
        {
            System.out.println(nums[i]);
        }
        
        //2d array
        /* int a[] = { 1,2,3,4 };
         * int b[] = { 2,4,6,8 };
         * int c[] = { 5,6,7,8 };
        */

        //2d array can be declared
        int d[][] = {
                        { 1,2,3,4 },
                        { 2,4,6,8 },
                        { 5,6,7,8 }
                    };
        
                    
        for( int i=0; i<d.length; i++) //for the rows
        {
            for(int j=0; j<d[i].length; j++)//for the columns
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
