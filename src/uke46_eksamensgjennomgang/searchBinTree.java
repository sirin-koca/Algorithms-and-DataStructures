package uke46_eksamensgjennomgang;

// Simple demo of search in unordered binary tree

public class searchBinTree
{
    public static class treeNode
    {
        // Binary tree node with character data

        char data;
        treeNode left, right;

        public treeNode(char c, treeNode l, treeNode r)
        {
            data = c;
            left = l;
            right = r;
        }
    }

    public static boolean contains(treeNode root, char x)
    {
        // Searches for value x in binary tree rooted at root

        if (root == null)
            return false;
        if (root.data == x)
            return true;
        return (contains(root.left, x) || contains(root.right, x));
    }

    public static void main(String args[])
    {
	/* Test program using this binary tree:

	              A
                     / \
                    B   C
                   / \   \
                  /   \   \
                 /     \   \
                D       E   F
               / \     / \   \
              G   H   I   J   K
                     / \
                    L   M
	 */

        treeNode root = new treeNode('A', new treeNode('B', new treeNode('D',
                new treeNode('G', null, null), new treeNode('H', null, null)),
                new treeNode('E', new treeNode('I', new treeNode('L', null, null),
                        new treeNode('M', null, null)), new treeNode('J', null, null))),
                new treeNode('C', null, new treeNode('F', null,
                        new treeNode('K', null, null))));

        System.out.println("\n           A");
        System.out.println("          / \\");
        System.out.println("         B   C");
        System.out.println("        / \\   \\");
        System.out.println("       /   \\   \\");
        System.out.println("      /     \\   \\");
        System.out.println("     D       E   F");
        System.out.println("    / \\     / \\   \\");
        System.out.println("   G   H   I   J   K");
        System.out.println("          / \\");
        System.out.println("         L   M\n");

        for (char c ='A'; c <= 'Z'; c+=3)
            if (contains(root, c))
                System.out.println("Tree contains " + c);
            else
                System.out.println("Tree does not contain " + c);
    }
}