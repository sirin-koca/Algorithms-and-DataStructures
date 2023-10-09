package examples;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int n_1 = 1;
        int n_2 = 0;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = n_1 + n_2;
            n_2 = n_1;
            n_1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
