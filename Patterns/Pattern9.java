/*
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5

*/
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        int num = 1;
        int spaces = rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            int currentNum = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;
            }

            currentNum -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(currentNum + " ");
                currentNum--;
            }

            System.out.println();
            spaces--;
            num++;
        }
        sc.close();
    }
}
