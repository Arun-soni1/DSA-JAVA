import java.util.*;
public class StackEx {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> stack = new Stack<>(); 
        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("to");
        stack.push("my");
        stack.push("First");
        stack.push("Stack");
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                           + " stack is: " + stack.peek());
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
        System.out.println("Popped element: "
                           + stack.pop());
        Integer pos = (Integer) stack.search("Welcome");
        System.out.println(pos);
    }
}