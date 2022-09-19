package uke35;

/**
 * Hvis vi skal teste effektiviteten til algoritmer som arbeider med tabeller, trenger vi ofte store tabeller
 * med et tilfeldig innhold. I noen tilfeller kreves det at alle verdiene er forskjellige og i andre tilfeller
 * er det aktuelt med like verdier. Hvis alle verdiene skal være forskjellige, kan vi like gjerne la det være
 * tallene fra 1 til n. Java har flere metoder som genererer tilfeldige enkelttall. Et eksempel er metoden
 * int nextInt(int n) i Random som returnerer et tilfeldig heltall fra mengden {0, 1, 2, . . . , n - 1}.
 */

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



