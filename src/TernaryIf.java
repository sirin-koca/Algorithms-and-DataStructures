public class TernaryIf {

    public static void main(String[] args) {

        int a = 5;
        int b = myTernaryIfTest(a);

        System.out.println(b);
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