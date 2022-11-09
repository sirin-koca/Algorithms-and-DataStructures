package uke39_lenkedelister;

public class Node {
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
