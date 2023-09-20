package examples;

import java.util.NoSuchElementException;

public class EnkelOmbytting {

    public static int ombyttinger(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom!");
        }

        int ombyttinger = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                ombyttinger++;
            }
        }
        return ombyttinger;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1}; // Eksempel liste
        int antallOmbyttinger = ombyttinger(a);
        System.out.println("Antall ombyttinger: " + antallOmbyttinger);
    }
}
