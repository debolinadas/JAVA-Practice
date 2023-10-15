
//Vector is a synchronized, thread-safe legacy implementation of the List interface.
// It offers ArrayList-like capabilities but with added thread safety.  

import java.util.Vector;

public class Col5 {
    public static void main(String[] args) {
        Vector<String> numbers = new Vector<>();
        numbers.add("I");
        numbers.add("20");
        numbers.add("okay");

        System.out.println(numbers.get(2)); // Output: 30
        System.out.println(numbers.size()); // Output: 3
        numbers.removeElementAt(1);
        System.out.println(numbers); // Output: [10, 30]
    }
}
