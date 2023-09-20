package examples;

import java.util.Arrays;

public class Kvikksortering {

    // Swaps two elements in an array
    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Partitioning logic
    private static int parter0(int[] a, int v, int h, int skilleverdi) {
        while (true) {
            while (v <= h && a[v] < skilleverdi) v++;
            while (v <= h && a[h] >= skilleverdi) h--;

            if (v < h) bytt(a, v++, h--);
            else return v;
        }
    }

    // Modified partitioning using an index for the pivot
    private static int sParter0(int[] a, int v, int h, int indeks) {
        bytt(a, indeks, h);  // Move pivot to end for easier comparison
        int pos = parter0(a, v, h - 1, a[h]);
        bytt(a, pos, h);  // Restore pivot to its correct position
        return pos;
    }

    // Recursive quicksort logic
    private static void kvikksortering0(int[] a, int v, int h) {
        if (v >= h) return;
        int k = sParter0(a, v, h, (v + h) / 2);  // Using mid value as pivot
        kvikksortering0(a, v, k - 1);           // Sort left side of pivot
        kvikksortering0(a, k + 1, h);           // Sort right side of pivot
    }

    // Public method to sort the entire array
    public static void kvikksortering(int[] a) {
        kvikksortering0(a, 0, a.length - 1);
    }

    // Public method to sort a specific segment of the array
    public static void kvikksortering(int[] a, int fra, int til) {
        // Include boundary checks if necessary
        kvikksortering0(a, fra, til - 1);
    }

    // (Optional) Add main method or other utility methods for testing
    public static void main(String[] args) {
        // Sample test array
        int[] array = {-1, 9, -9, 8, -8, 4, 0, 7, -7, 1, 5, -3, 2, 3, 10, -10, 6, -4, -5, -2, -6};

        System.out.println("Original Array: " + Arrays.toString(array));

        kvikksortering(array);  // Sorting the entire array

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

}

