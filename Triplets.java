

/*Given an array of distinct elements. The task is to find triplets in array whose sum is equal to a given number. */

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int j;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(j=0; j<n; j++)
        {
            arr[j] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nEnter the sum value : ");
        int sum = sc.nextInt();
       for(int i=0; i<n-2;i++)
       {
        for(j=i+1; j<n-1;j++)
        {
            for(int k=j+1; k<n;k++)
            {
                if(arr[i]+arr[j]+arr[k] == sum)
                {
                    System.out.println(arr[i]+ " "+ arr[j] + " "+ arr[k]);
                }
            }
        }
       }
        sc.close();
    }
}
