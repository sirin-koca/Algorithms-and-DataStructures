package uke35_permutasjoner_binærtrær;

// Class containing left and right child of current node and key value
class Node {
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

// A Java program to introduce Binary uke35_permutasjoner_binærtrær.Tree
public class BinaryTreeClass {
    // Root of Binary uke35_permutasjoner_binærtrær.Tree
    Node root;

    // Constructors
    public BinaryTreeClass(int key) {
        root = new Node(key);
    }

    BinaryTreeClass() { root = null; }

    public static void main(String[] args)
    {
        BinaryTreeClass tree = new BinaryTreeClass();

        // create root
        tree.root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

		/* 2 and 3 become left and right children of 1

		    1
		 /	   \
		2	    3
	   / \	   /  \
	null null null null

	*/

        tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/

        /**
         *
         *       A(0)
         *      /   \
         *     B(1)  C(2)
         *   /   \      \
         *  D(3)  E(4)   F(6)
         *
         *
         * OR,
         *       A(1)
         *      /   \
         *     B(2)  C(3)
         *   /   \      \
         *  D(4)  E(5)   F(7)
         *
         *
         *
         *
         * **/
    }
}
