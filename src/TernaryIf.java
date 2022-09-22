public class TernaryIf {

    public static void main(String[] args) {

        int a = 17;
        int b = (a < 5) ? 13 : 17;

        for (int i=0; i<10; ++i) {
            a = i;
            b = myTernaryIfTest(a);

            System.out.println(b);
        }
    }

    public static int myTernaryIfTest(int value) {

        /*
        if (value < 5) {
            return 0;
        }
        else {
            return 98;
        }
        */

        return (value < 5) ? 0 : 98;
    }
}