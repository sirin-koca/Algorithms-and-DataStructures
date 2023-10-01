package binarySearch_VS_binarySearchTree;

// BAsic insertion
public class BinarySearchTreeDemo1 {
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
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
}

