
//Java Program to check whwther a number is a Duck number or not
//Duck number is a number that have atleast one digit as 0 but the first digit shouldnt be 0

import java.util.*;

public class Col1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        if(number.contains("0") && !number.startsWith("0"))
        {
            System.out.println(number + " is a Duck number");
        }
        else{
            System.out.println(number+ " is not a Duck number");
        }
        sc.close();
    }
}
