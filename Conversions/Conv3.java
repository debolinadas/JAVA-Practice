//Hexa-Decimal to Decimal

import java.util.Scanner;

public class Conv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number");
        String hex = sc.nextLine();
        String bin="";
        int rem, dec_num=0, base=1;
        for(int i=0; i<hex.length(); i++)
        {
            if(hex.charAt(i)=='A')
            {
                bin = bin + "1010";
            }
            else if(hex.charAt(i)=='B')
            {
                bin = bin + "1011";
            }
            else if(hex.charAt(i)=='C')
            {
                bin = bin + "1100";
            }
            else if(hex.charAt(i)=='D')
            {
                bin = bin + "1101";
            }
            else if(hex.charAt(i)=='E')
            {
                bin = bin + "1110";
            }
            else if(hex.charAt(i)=='F')
            {
                bin = bin + "1111";
            }
            else if(hex.charAt(i)=='1')
            {
                bin = bin + "0001";
            }
            else if(hex.charAt(i)=='2')
            {
                bin = bin + "0010";
            }
            else if(hex.charAt(i)=='3')
            {
                bin = bin + "0011";
            }
            else if(hex.charAt(i)=='4')
            {
                bin = bin + "0100";
            }
            else if(hex.charAt(i)=='5')
            {
                bin = bin + "0101";
            }
            else if(hex.charAt(i)=='6')
            {
                bin = bin + "0110";
            }
            else if(hex.charAt(i)=='7')
            {
                bin = bin + "0111";
            }
            else if(hex.charAt(i)=='8')
            {
                bin = bin + "1000";
            }
            else
            {
                bin = bin + "1001";
            }      
        }
        System.out.println("Binary number : " + bin);
        //binary to decimal conversion
        int num = Integer.parseInt(bin);
        while(num>0)
        {
            rem = num%10;
            dec_num = dec_num + (rem*base);
            num = num/10;
            base = base * 2;
        }
        System.out.println("Decimal number : "+ dec_num);
        sc.close();
    }
}
