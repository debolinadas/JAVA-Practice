public class hello 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello , Good Morning !!");
        int i = 56; // integer => 4 byte
        System.out.println(i);
        short s = 5; // 2 bytes => 16 bits => -32768 to 32767
        System.out.println(s);
        byte b = 5 ;//1 byte => 8 bits => -128 to 127
        System.out.println(b);
        long l = 50000000000l; //8 bytes
        System.out.println(l);
        float f = 5.5f;
        System.out.println(f);
        double d = 5.5;
        System.out.println(d);

        char c = 'A';
        c = 66;//American standard code for information interchange
        System.out.println(c);

        double d1 = 6;//Implicit conversion
        System.out.println(d1);

        int k = (int)8.903;//Explicit Conversion
        System.out.println(k);    
    }
}
