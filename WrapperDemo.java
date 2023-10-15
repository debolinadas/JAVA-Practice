public class WrapperDemo 
{
    public static void main(String[] args) {
        
        
        /*Integer ii = new Integer(i); -->Boxing - wrapping
        int j = ii.intValue(); --> unboxing - unwrapping
        Integer value = i ; --> Autoboxing
        int k = value ; --> Autounboxing
         * 
         * reference variable - i1
         * class - wrapper class
        */
        
        String str = "123";
        int m = Integer.parseInt(str); //Takes input a string and gives an integer output
        System.out.println(m);
    }
    
}
