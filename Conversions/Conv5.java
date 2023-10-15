
//Decimal to binary

import java.util.Scanner;

public class Conv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number : ");
        int n = sc.nextInt();
        
        int bin_num[] = new int[100];
        int c=0;
        while(n>0)
        {
            bin_num[c] = n%2;
            n = n/2;
            c++;
        }

        for (int j = c - 1; j >= 0; j--)
            System.out.print(bin_num[j]);

        
        sc.close();
    }
}
