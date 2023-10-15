public class Basics2 {
    public static void main(String[] args) {
        int a = 5, b = 100;
        System.out.println("a = "+a+" b = "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a+" b = "+b);
    }
    
}
