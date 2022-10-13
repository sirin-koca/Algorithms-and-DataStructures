package uke35_permutasjoner_binærtrær;

import java.util.Random;

public class RandomTabell2 {
    public static int[] randPerm(int n)  // virker, men er svært ineffektiv
    {
        Random r = new Random();      // en randomgenerator
        int[] a = new int[n];         // en tabell med plass til n tall

        for (int i = 0; i < n; )      // vi skal legge inn n tall
        {
            int k = r.nextInt(n) + 1;   // trekker et nytt tall k

            int j = 0;
            for ( ; j < i; j++)         // leter i intervallet a[0:i>
            {
                if (a[j] == k) break;     // stopper hvis vi har k fra før
            }
            if (i == j) a[i++] = k;     // legger inn k og øker i
        }
        return a;                     // tabellen returneres
    }
}

