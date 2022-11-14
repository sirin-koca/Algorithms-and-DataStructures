package uke46_eksamensgjennomgang;

public class BST_Binary_Search_Tree {

    public static void main(String[] args) {
        BST tree = new BST();

        int[] myNums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        //Test utskrift av treet
        for (int i = 0; i < myNums.length; i++) {
            tree.insert(myNums[i]);
            tree.printPre();
        }
        System.out.println();
        for (int i = 0; i < myNums.length; i++) {
            tree.insert(myNums[i]);
            tree.printIn();
        }

        //Test at vi kan finne noder
        System.out.println(tree.search(18));
        System.out.println(tree.search(8));
    }

    // Node-klasse som har alt vi trenger for hver eneste node i det binære søketreet.
    public static class Node {
        Node parent;
        Node left_child;
        Node right_child;
        int value;

        Node() {
            //parent == null, left_child == null, right_child == null, value == 0
        }

        // Lager en node med null som foreldre og barne-pekere
        Node(int value) {
            this.value = value;
            this.parent = null;
            this.left_child = null;
            this.right_child = null;
        }
        Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
            this.left_child = null;
            this.right_child = null;
        }
        Node(int value, Node parent, Node left_child, Node right_child) {
            this.value = value;
            this.parent = parent;
            this.left_child = left_child;
            this.right_child = right_child;
        }
        void printPreorderRecursive() {
            System.out.print(this.value + ", ");
            if (left_child != null) {
                left_child.printPreorderRecursive();
            }
            if (right_child != null) {
                right_child.printPreorderRecursive();
            }
        }
        void printInorderRecursive(){
            if (left_child != null) {
                left_child.printInorderRecursive();
            }
            System.out.print(this.value + ", ");
            if (right_child != null) {
                right_child.printInorderRecursive();
            }
        }
    }

    /**
     * Binary search tree (BST)-klasse som har rot-noden og annen info
     * om vårt søketre. Har også metoden for innlegging, fjerning, søking, etc
     */
    public static class BST {
        Node root;

        // Metode for å søke etter verdien i søketreet, returnerer null om verdien ikke finnes.
        Node search(int value) {
            Node myNode = root;
            //Så lenge vi er utenfor treet, og ikke funnet verdien vår
            while (myNode != null && myNode.value != value) {
                if (value > myNode.value) {         // Hvis verdien er større enn myNode
                    myNode = myNode.right_child;    // Gå til høyre
                }
                else if (value < myNode.value) {    // Hvis verdien er mindre enn myNode
                    myNode = myNode.left_child;     // gå til venstre
                }
                else {      // Hvis verdien er lik myNode => returner.
                    break;
                }
            }
            return myNode;
        }

        void insert(int value) {
            //Treet vårt er tomt, vi lager første node!
            if (root == null) {
                root = new Node(value);
                return;
            }
            //Treet er ikke tomt => vi må legge inn verdien på riktig plass
            else {
                //Initialiser og sett noden vi ser på (p) til rot-noden
                Node p = root;
                Node q = null; //Parent til p

                while (p != null) {
                    q = p; // oppdater at nåværende p blir nye p sin forelder
                    if (value >= p.value) {
                        //Flytt p ett hakk nedover
                        p = p.right_child;
                    } else {
                        //Flytt p ett hakk nedover.
                        p = p.left_child;
                    }
                }

                //Nå har vi funnet hvor den nye noden skal ligge!
                //nye noden skal være høyre eller venstre barn av q.
                if (value >= q.value) {
                    q.right_child = new Node(value, q);
                } else {
                    q.left_child = new Node(value, q);
                }
            }
        }

        public void printPre() {
            this.root.printPreorderRecursive();
            System.out.println();
        }
        public void printIn(){
            this.root.printInorderRecursive();
            System.out.println();
        }
    }
}