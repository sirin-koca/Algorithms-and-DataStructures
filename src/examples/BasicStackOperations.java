package examples;

import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Peeking top element
        System.out.println("Top element: " + stack.peek());

        // Popping top element
        System.out.println("Popped element: " + stack.pop());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Getting size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Searching for an element
        System.out.println("Position of 10: " + stack.search(10));
    }
}

        /*
        if(stack.isEmpty()) {
        System.out.println("The stack is empty");
        } else {
        System.out.println("The stack is not empty");
        }
        */