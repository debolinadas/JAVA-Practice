
//An implementation of the List interface called ArrayList stores its elements in a resizable array.
// It offers quick random access and effective insertion and deletion at the conclusion. 


import java.util.ArrayList;

public class Col4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers.get(1)); // Output: 20
        System.out.println(numbers.size()); // Output: 3
        numbers.remove(0);
        System.out.println(numbers); // Output: [20, 30]
    }

}
