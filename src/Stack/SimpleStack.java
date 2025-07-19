package Stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Dinesh");
        stack.push("Vishala");
        stack.push("Bhuvana");
        stack.push("Lakshu");
        stack.push("Cin");
        stack.add(2,"3");


        System.out.println(stack.search("Bhuvana"));
        System.out.println(stack);
    }
}
