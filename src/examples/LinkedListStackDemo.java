package examples;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class LinkedListStackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Should print 3

        System.out.println("Popped element: " + stack.pop()); // Should print 3
        System.out.println("Popped element: " + stack.pop()); // Should print 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false

        System.out.println("Top element: " + stack.peek()); // Should print 1

        System.out.println("Popped element: " + stack.pop()); // Should print 1
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
    }
}

