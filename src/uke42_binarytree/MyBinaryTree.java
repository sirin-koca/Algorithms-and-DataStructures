package uke42_binarytree;


import java.util.Arrays;

public class MyBinaryTree {

    public static class Node {
        // Each node has a reference to its parent and child node.
        Node parent;
        Node left_child;
        Node right_child;
        char value;  // Each node stores a character value.

        public Node(char value) {
            this.value = value;
        } // constructor for Node class.

        MyBinaryTree.Node grandParent() {
            return this.parent.parent;
        }
    }

    public static void main(String[] args) {
        char[] a = {'H', 'E', 'L', 'L', 'O', 'J', 'A', 'V', 'A'};

        Node root = new Node(a[0]); // A new node is created as the root of the binary tree with the value 'A' as a[0].

        //Node root = new Node(a[0]);        // The root node with value 'A'
        root.left_child = new Node(a[1]);   // The left child with value 'B'
        root.right_child = new Node(a[2]); // The right child with value 'C'

        System.out.println(Arrays.toString(a)); // Print the content of the array a[] using Arrays.toString(a).
        System.out.print(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + i + ", ");
        }
    }
}