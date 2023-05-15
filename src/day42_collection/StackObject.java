package day42_collection;

import java.util.Stack;

public class StackObject {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('q');
        stack.push('a');
        stack.push('c');
        stack.push('f');
        stack.push('g');


        // return one from the top LIFO
        System.out.println(stack.peek());
        System.out.println(stack);


        // remove the element from the top
        stack.pop();

        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        // you can but not following idea of Stack

        stack.remove(0);
        System.out.println(stack.peek());


    }
}
