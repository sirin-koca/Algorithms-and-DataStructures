package uke35;

import java.util.Random;

public class RandomTabell1 {
    public static int[] randPerm(int n)  // en versjon som ikke virker
    {
        Random r = new Random();      // en randomgenerator
        int[] a = new int[n];         // en tabell med plass til n tall

        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(n) + 1;    // tabellen fylles med tall

        return a;                     // tabellen returneres
    }

}



