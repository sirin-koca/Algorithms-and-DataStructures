package oppgaver;

public class TernaryIf1 {

    public static void main(String[] args) {

        int a = 0;
        int b = 5;
        int c = 10;
        int d = 15;

        System.out.println(myTernaryIfTest(a));
        System.out.println(myTernaryIfTest(b));
        System.out.println(myTernaryIfTest(c));
        System.out.println(myTernaryIfTest(d));
    }

    public static int myTernaryIfTest(int value) {

        /*
        if (value <= 10) {
            return 1;
        }
        else {
            return 0;
        }
        */

        return (value <= 10) ? 1 : 0;
    }
}