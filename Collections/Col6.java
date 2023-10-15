//A last-in, first-out (LIFO) stack of items is represented by the subclass of Vector called Stack.
// It offers particular stack operations, such as pop() and push(). 

import java.util.Stack;

public class Col6 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println(stack.pop()); // Output: Orange
        System.out.println(stack.size()); // Output: 2
        System.out.println(stack.peek()); // Output: Banana
        stack.push("Momo");
        System.out.println(stack.peek());
    }
}
