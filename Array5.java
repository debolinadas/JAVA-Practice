/*WAP to Sort elements of an array by frequency */

public class Array5 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,8,3,2,2,2,5,1};
        int fr[] = new int[arr.length];

        int visited = -1;
        for(int i=0; i< arr.length; i++)
        {
            int count=1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }

            if(fr[i] != visited)
            {
                fr[i] = count;
            }
        }

        int temp;
        for(int k=0; k<fr.length; k++)
        {
            if(fr[k]!=visited)
            {  
                if(fr[k] > fr[k+1])
                {
                    temp = fr[k];
                    fr[k] = fr[k+1];
                    fr[k+1] = temp;
                }       
                                  
            }
            System.out.println("    " + arr[k] + "    |    " + fr[k]); 
        }

        
    }
}
