package uke37_generics_og_javateknisk;

import java.util.Arrays;

public class ShuffleAlgorithm_ObjectSuperClass_JavaLang {
    public static void main(String[] args) {
        Object[] a = {"Sirin", "Maya", "Dewi", "Murat", "Gül", "Elisabeth", "Hilfred", "Jack", "Nil", "Deniz"};
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
