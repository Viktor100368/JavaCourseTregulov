package list.vector.stack;

import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ivan");
        stack.push("Natalia");
        stack.push("Maria");
        stack.push("Anton");
        stack.push("Igor");
        System.out.println("after all command push "+stack);
        System.out.println("------------------------------");
        System.out.println("command peek "+stack.peek());
        System.out.println("after command peek "+stack);
        System.out.println("--------------------------------");
        while(!stack.isEmpty()) {
            System.out.println("pop -> " + stack.pop());
            System.out.println("after command pop --> " + stack);
        }
    }
}
