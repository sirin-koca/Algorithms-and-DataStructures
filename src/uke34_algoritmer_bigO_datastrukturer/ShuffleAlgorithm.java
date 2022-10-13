package uke34_algoritmer_bigO_datastrukturer;

import java.util.Arrays;

public class ShuffleAlgorithm {
    public static void main(String[] args) {
        String[] a = {"Sirin", "Maya", "Dewi", "Murat", "Gül", "Elisabeth", "Hilfred", "Jack", "Nil", "Deniz"};
        // Shuffle the array
        shuffle(a);
        // Print the result
        System.out.println(Arrays.toString(a));
    }

    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i = n; i > 1; i--) {
            // choose index in [0, i-1)
            int r = (int) (Math.random() * (i - 1));
            Object swap = a[r];
            a[r] = a[i - 1];
            a[i - 1] = swap;
        }
    }
}
