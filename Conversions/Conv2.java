//Octal to decimal

import java.util.Scanner;

public class Conv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, oct_num=0, dec_num=0, base=1, rem;
        System.out.println("Enter the octal number : ");
        num = sc.nextInt();

        oct_num = num;

        while(num>0)
        {
            rem = num%10;
            dec_num = dec_num + (rem*base);
            num = num/10;
            base = base * 8;
        }

        System.out.println("Octal number : "+ oct_num);
        System.out.println("Decimal number : "+ dec_num);

        sc.close();
    }
}
