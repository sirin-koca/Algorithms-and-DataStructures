package examples;

public class FibonacciIterative {

    // Fibonacci sequence: F(n)=F(n−1)+F(n−2) for n≥2 and F(0)=0, F(1)=1
    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prevPrev = 0;  // Represents F(n-2)
        int prev = 1;      // Represents F(n-1)
        int current = 0;   // Represents F(n)

        for (int i = 2; i <= n; i++) {
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 10; // For getting the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciIterative(n));
    }
}
