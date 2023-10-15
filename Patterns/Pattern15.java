import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int size = sc.nextInt();
        int mat[][]=new int[size][size];
        int min_c =0;
        int max_c =size-1;

        int min_r =0;
        int max_r =size-1;

        int c =1;
        while(c<=(size*size))
        {
            for(int i=min_c; i<=max_c; i++)
            {
                mat[min_r][i] =c;
                c++;
            }
            for(int j=min_r+1; j<=max_r; j++)
            {
                mat[j][max_c] = c;
                c++;
            }
            for(int k=max_c-1; k>=min_c; k--)
            {
                mat[max_r][k] =c;
                c++;
            }
            for(int r=max_r-1; r>=min_r+1; r--)
            {
                mat[r][min_c] =c;
                c++;
            }
            min_c++;
            min_r++;
            max_c--;
            max_r--;
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}
