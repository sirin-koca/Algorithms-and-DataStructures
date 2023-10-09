package examples;

public class SwapExample1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Using the swap method
        int temp = a; // We need to store the a in a temporary var before overwriting
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
