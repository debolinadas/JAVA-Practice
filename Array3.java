/*WAP to identify Arrays are disjoint or not */
public class Array3 
{
    // This function prints all distinct elements
    static boolean Disjoint(int arr1[], int arr2[])
    {
        
        for(int i=0; i<arr1.length; i++){
        for(int j=0; j<arr2.length; j++){
            if(arr1[i]==arr2[j]){
                return false;   
            }
        }
    }
    return true;
    }
 
    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr1[] = {4, 5, 7};
        int arr2[] = {6, 8, 1, 9, 10};
        
        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

