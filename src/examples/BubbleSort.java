package examples;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {1, 7, 2, 14, 8, 13, 3, 4, 6, 5, 10, 15, 12, 11, 9};

        myFunc(x);
        System.out.println(Arrays.toString(x));

    }

    public static void myFunc(int[] x) {
        int n = x.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }

}
