public class TernaryIf {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int a = i;
            int b = ternaryIfTest(a);
            System.out.println(b);
        }

        // int a = 17;
        // int b = (a < 5) ? 13 : 17;
    }

    public static int ternaryIfTest(int value){
        return (value < 5) ? 0 : 100;
    }
}
