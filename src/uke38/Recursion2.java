package uke38;

import java.util.Arrays;

/**
 * Binærsøk(x, verdi, v, h)
 * 1) hvis v == h, sjekk om x[v]== verdi, og returner
 * 2) Finn midten m
 * 3) Hvis verdi >= x[m]
 * Hvis x[m] == verdi, returner m
 * Ellers, binærsøk (x, verdi, m + 1, h);
 * Ellers, binærsøk(x, verdi, v, m-1);
 */

public class Recursion2 {
    public static void main(String[] args) {

        int[] x = {0, 2, 4, 6, 9, 12, 13, 99};

        countdown(5);
        System.out.println(Arrays.toString(x));

        factorial(5);
        System.out.println(Arrays.toString(x));

        System.out.println(binarySearch(x, 3));
        for (int xi : x) {
            System.out.println("Verdi " + xi + " er i index " + binarySearch(x, xi));

        }

        System.out.println(binarySearch(x, 5, 2, 7));
        System.out.println(binarySearch(x, 7, 5, 8));

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } // basistilfellet
        return n * factorial(n - 1);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println(n + " break!");
            return;
        }
        System.out.println(n + " ... ");
        countdown(n - 1);
    }

    public static int binarySearch(int[] x, int verdi) {
        return binarySearch(x, verdi, 0, x.length - 1);

    }

    public static int binarySearch(int[] x, int verdi, int v, int h) {
        if (v == h) {
            // sjekk om x[v] == verdi
            return (verdi == x[v]) ? v : -1; // Hva kan vi skrive her på en bedre return verdi ?
        }

        int m = (v + h) / 2; // Finner midten (heltalssdivisjon)

        if (verdi == x[m]) return m; // Sjekker om verdi ligger i x[m]

        // Rekursjon
        if (verdi > x[m])

            return binarySearch(x, verdi, m + 1, h);
        else return binarySearch(x, verdi, v, m - 1);


    }


}
