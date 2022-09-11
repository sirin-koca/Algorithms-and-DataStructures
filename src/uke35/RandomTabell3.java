package uke35;

import java.util.Random;

public class RandomTabell3 {
    public static int[] randPerm(int n)  // virker, men er ineffektiv
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall
        boolean[] har = new boolean[n];  // en boolsk tabell

        for (int i = 0; i < n; )         // vi skal legge inn n tall
        {
            int k = r.nextInt(n);          // trekker en indeks k
            if (har[k] == false)           // sjekker
            {
                har[k] = true;               // oppdaterer den boolske tabellen
                a[i++] = k + 1;              // legger inn k + 1 i a
            }
        }
        return a;                        // tabellen returneres
    }

}
