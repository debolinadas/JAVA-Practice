public class operator {
    public static void main(String args[])
    {
        /*
         * Arithmetic operators - +,-,*,/,%
         * Logical Operator -
         * Bitwise operator -
         * Relational operator -
         * Unary operator 
         * ternary operator
         * Shift operator
         * Assignment operator
         */

         int m = 12 , n = 3, o = 5;
         int r1 = m + n;
         int r2 = m - n;
         int r3 = m * n;
         int r4 = m / n;
         int r5 = m % n;
         int r6 = m / o;
         double r7 = (double)m / o;
         //shorthand operators 
         m += 3; // m = m + 3
         ++n;   // pre - increment 
         o++;  // post - increment 

         System.out.println(r1);
         System.out.println(r2);
         System.out.println(r3);
         System.out.println(r4);
         System.out.println(r5);
         System.out.println(r6);
         System.out.println(r7);
         System.out.println(m);
         System.out.println(n);
         System.out.println(o);
    }
}
