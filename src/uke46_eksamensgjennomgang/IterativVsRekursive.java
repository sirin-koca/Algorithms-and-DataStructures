package uke46_eksamensgjennomgang;

public class IterativVsRekursive {
    public static void main(String[] args) {

    }

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            Node next=null;
            Node prev=null;
        }

        // Rekursiv
        int position;
        Node position(int index){
            if(position==0){
                return this;
            }
            else{
                return this.next.position(index-1);
            }
        }

        // Iterativ
        Node positon(Node head, int index){
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

        // vi skal legge inn q i midten av p og r
        public void insert(Node p, Node q, Node r){
            p.next=q;
            q.next=r;
            r.prev=q;
            q.prev=p;
        }

        // la oss si at vi skal fjerne q
        public void remove(Node p, Node q, Node r){
            p.next=r;
            r.prev=p;
        }
    }
}
