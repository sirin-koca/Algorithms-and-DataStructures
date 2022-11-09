package uke39_lenkedelister;

public class MainDriver {
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
