import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        int odd=0, even=0, k;
        int arr[] = new int[n];
        System.out.println("Enter elements :");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.print("The array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        for(k=0; k<n; k++)
        {
            if(arr[k]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of even elements : "+ even);
        System.out.println("The number of odd elements : "+ odd);
        
    }
}
