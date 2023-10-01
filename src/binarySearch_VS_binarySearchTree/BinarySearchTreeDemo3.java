package binarySearch_VS_binarySearchTree;

public class BinarySearchTreeDemo3 {
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

    public Node insert(int value) {
        return insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
}
