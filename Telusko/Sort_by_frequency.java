//input : [4,3,1,6,4,3,6,4]
//Output : [4,4,4,3,3,6,6,1]

public class Sort_by_frequency {

    static int x=0; //Indicates the row number
    public static void main(String[] args) {
        int a[] = {4,3,1,6,4,3,6,4};
        int b[][] = new int[a.length][2];
        
        a = sort(a);//Sorts the array
        //Initializing the 1st row - 1st Column element of 2d array 
        //to be the first element of the sorted array
        b[x][0] = a[0];
        //Constructing the rest of the array
        for(int i=1; i<a.length; i++)
        {
            if(a[i] == a[i-1])//If the element matches with the previous element
            {
                b[x][1] = b[x][1] + 1;//x-rows : 2nd Column = increment
            }
            else
            {
                x++;//if the element doesnt match, row number is increased
                b[x][0] = a[i];
            }
        }
        x++;

        b = sort(b);//method overloading

        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=b[i][1]; j++)//print the element acc to the number of frequency
            {
                System.out.print(b[i][0]+ " ");
            }
        }
        System.out.println();

    }

    public static int[][] sort(int b[][])
    {
        //Every element in a 2d array is a 1d array here
        //with exactly 2 elements 
        int c[] = new int[2];

        for(int i=0; i<x; i++)//loop will continue till the updated x
        {
            for(int j=i; j<x; j++)
            {
                //comparing the 2nd element of the individual elements in the 2d array b[x:0,1,2...][1]
                if(b[i][1] < b[j][1])
                {
                    c = b[i]; //swap with ith element of b (b[i] is a 1d array)
                    b[i] = b[j];
                    b[j] = c;
                }
            }
        }
        return b;
    }

    public static int[] sort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }
}
