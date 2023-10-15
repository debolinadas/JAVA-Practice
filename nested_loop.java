public class nested_loop {
    public static void main(String[] args)
    {
        /*
         * ££££
         * ££££
         * ££££
         * ££££
         */
        
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=1 ; j<=4 ; j++)
            {
                System.out.print("£ ");
            }
            System.out.println(" ");
        }

        System.out.println();

        int m = 1;
        while(m <= 4)
        {
            int q = 1;
            while(q <= 4)
            {
                System.out.print("& ");
                q++;
            }
            System.out.println();
            m++;
        }
        System.out.println();
        /*
         *  1 2 3 4
            1 2 3 4
            1 2 3 4
            1 2 3 4
         */
        for(int i=1 ; i<=4 ; i++)
        {
            for(int j=1 ; j<=4 ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
