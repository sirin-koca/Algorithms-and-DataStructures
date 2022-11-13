package uke39_lenkedelister;

class Node {
    int data;
    Node next;

    Node position(int index){
        if(index == 0){
            return this;
        }
        else{
            return position(index-1);
        }
    }
}

class LinkedListClass {
    Node head;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedListClassDriver {
    public static void main(String[] args) {

        LinkedListClass listClass = new LinkedListClass();
        listClass.insert(1);
        listClass.insert(2);
        listClass.insert(3);
        listClass.insert(100);
        listClass.insert(200);
        listClass.insert(300);

        listClass.show();

    }
}
