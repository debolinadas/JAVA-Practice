class A
{
    public static void main(String args[])
    {
        String text = "DebolinaDasGanguly";
        String pattern = "Gang";


        int count =0;
        int t_len = text.length();
        int p_len = pattern.length();
        char c,p;

        for(int i=0; i<=t_len-p_len; i++)
        {
            c = text.charAt(i);
            p = pattern.charAt(0);

            if(c == p)
            {
                for(int j=i,k=0; j<i+p_len; j++,k++)
                {
                    c = text.charAt(j);
                    p = pattern.charAt(k);


                    if(c==p)
                    {
                        count++;
                    }
                }
            }
        }
        
        if(count == p_len)
            System.out.println("Matched");
        else
            System.out.println("Not matched");
    }
}