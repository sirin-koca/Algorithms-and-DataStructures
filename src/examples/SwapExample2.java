package examples;

public class SwapExample2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Using the swap method
        swap(a, b);

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
