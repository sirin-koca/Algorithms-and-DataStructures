package uke46_eksamensgjennomgang;

import java.util.ArrayDeque;

public class TraversingLevelOrder {
    static class Node{
        char data;
        Node leftChild;
        Node rightChild;

        public Node(char data){
            this.data=data;
            this.leftChild=null;
            this.rightChild=null;
        }

        Node addLeftChild(char data){
            this.leftChild = new Node(data);
            return this.leftChild;
        }
        Node addRightChild(char data){
            this.rightChild = new Node(data);
            return this.rightChild;
        }
    }

   static void printMyTree(Node root){
        ArrayDeque<Node> myQue = new ArrayDeque<>();
        // Legger til rotnoden:
        myQue.addFirst(root);
        // Print out with while loop:
        while (!myQue.isEmpty()){
            //1. Ta ut første fra køen:
            Node current = myQue.removeFirst();
            //2. Legg til current sine barn i køen:
            if(current.leftChild != null){
                myQue.addLast(current.leftChild);
            }
            if(current.rightChild != null){
                myQue.addLast(current.rightChild);
            }
            //3. Skriver ut:
            System.out.print(current.data + ", ");
        }
    }
    public static void main(String[] args) {
        //Lager rot-noden:
        Node root = new Node('A');

        //Legg inn indre noder:
        Node b = root.addLeftChild('B');
        Node c = root.addRightChild('C');

        Node d = b.addLeftChild('D');
        Node e = b.addRightChild('E');

        Node f = c.addLeftChild('F');
        Node g = c.addRightChild('G');

       printMyTree(root);
    }
}
