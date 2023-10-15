import java.util.Scanner;

public class Conv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, bin_num=0, oct_num=0, base=1, rem, r=0;
        System.out.println("Enter the binary number : ");
        num = sc.nextInt();
        //Decimal Conversion
        int temp = num;
        while(num>0)
        {
            rem = num%10;
            bin_num = bin_num + rem*base;
            num = num/10;
            base = base*2;
        }

        //decimal to Octal Conversion
        while(bin_num>0)
        {
            r = bin_num%8;
            oct_num = oct_num*10 + r; 
            bin_num = bin_num/8;
        }


        System.out.println("Binary number = "+ temp);
        System.out.println("Octal number = "+ oct_num);
        sc.close();
    }
}
