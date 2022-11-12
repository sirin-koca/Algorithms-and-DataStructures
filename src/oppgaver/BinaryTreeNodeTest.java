package oppgaver;
import java.util.Arrays;

public class BinaryTreeNodeTest {
    public static class Node {
        Node parent;
        Node left_child;
        Node right_child;
        char value;

        public Node(char value) {
            this.value = value;
        }

        Node grandParent() {
            return this.parent.parent;
        }
    }

    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        Node root = new Node(a[0]);
        root.right_child = new Node(a[1]);
        root.left_child = new Node(a[2]);

        System.out.println(Arrays.toString(a));
        System.out.print("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + i + ", ");
        }
    }
}
