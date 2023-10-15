public class assignment1 {
    public static void main(String[] args)
    {
        //1
        //12
        //123
        //1234
        //12345
        //123456

        for(int i=1 ; i<=6 ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //A 
        //A B 
        //A B C 
        //A B C D
        //A B C D E
        //A B C D E F
        for(int i=65 ; i<=70 ; i++)
        {
            for(int j=65 ; j<=i ; j++)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }


        /*$ $ $ $ $ $
          $         $
          $         $ 
          $         $
          $         $
          $ $ $ $ $ $ */
        for(int i=1 ; i<=6 ; i++)
        {
            for(int j=1 ; j<=6 ; j++)
            {
                if(j>=2 && j<=5 && i>=2 && i<=5)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("$ ");
                }
            }
            System.out.println();
        }


    }
    
}
