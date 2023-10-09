package examples;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        // Adding elements to the Stack
        myStack.push(1);
        myStack.push(8);
        myStack.push(3);
        myStack.push(5);

        System.out.println("Original Stack: " + myStack);

        // Demonstrating peek
        System.out.println("Top element using peek: " + myStack.peek());

        // Retrieving elements using pop
        System.out.println("Popping out elements:");

        while(!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        // Stack should be empty now
        System.out.println("Stack after all pops: " + myStack);
    }
}

