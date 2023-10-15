// Java program to convert Decimal Number
// to Hexadecimal Number

import java.util.Scanner;

public class Conv4 {
	static void decTohex(int n)
	{
		// Creating an array to store octal number
		int[] hexNum = new int[100];

		// counter for hexadecimal number array
		int i = 0;
		while (n != 0) {
            // Storing remainder in hexadecimal array
			hexNum[i] = n % 16;
			n = n / 16;
			i++;
		}

		// Printing hexadecimal number array
		// in the reverse order
		for (int j = i - 1; j >= 0; j--) {
			if (hexNum[j] > 9)
				System.out.print((char)(55 + hexNum[j]));
			else
				System.out.print(hexNum[j]);
		}
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int n = sc.nextInt();
		decTohex(n);
        sc.close();
	}
}


