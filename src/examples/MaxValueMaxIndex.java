package examples;

import java.util.NoSuchElementException;

public class MaxValueMaxIndex {
    public static void main(String[] args) {
        int[] myArr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int max = maxValue(myArr);
        System.out.println(max);

        int maxIndex = maxIndex(myArr);
        System.out.println(maxIndex);

    }

    public static int maxValue(int[] a) {
        int n = a.length;

        int maxValue = a[0];

        if (n == 0) {
            throw new NoSuchElementException("The table is empthy!");
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (a[i] > maxValue) {
                    maxValue = a[i];
                }
            }
        }
        return maxValue;
    }

    public static int maxIndex(int[] a) {
        int n = a.length;

        int maxIndex = 0;

        if (n == 0) {
            throw new NoSuchElementException("The array is empthy!");
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (a[i] > a[maxIndex]) {
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }
}
