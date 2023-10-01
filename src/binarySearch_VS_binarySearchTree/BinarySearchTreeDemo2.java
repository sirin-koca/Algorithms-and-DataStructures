package binarySearch_VS_binarySearchTree;

public class BinarySearchTreeDemo2 {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.data) {
                if (current.left == null) {
                    current.left = new Node(value);
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Node(value);
                    return;
                }
                current = current.right;
            }
        }
    }
}
