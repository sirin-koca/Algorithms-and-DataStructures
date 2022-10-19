/*    Vi nøyer oss her med å teste maks-metoden for et vanlig tilfelle og et ulovlig tilfelle.
I oppgavene vil du bli bedt om å utvide testmetoden.
 */

package uke35_permutasjoner_binærtrær;

import static uke34_algoritmer_bigO_datastrukturer.MaxIndex.maks;

public class TestingAnAlgorithm {

    public static void main(String[] args) {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 45};  // maksverdien 10 er i posisjon 6. Neste runde: Tester 45 som størst
        System.out.println(maks(a));
    }


    public static void makstest() {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 45};  // maksverdien 10 er i posisjon 6

        if (maks(a) != 6)  // kaller maks-metoden
            System.out.println("Kodefeil: Gir feil posisjon for maksverdien!");

        a = new int[0];  // en tom tabell, lengde lik 0
        boolean unntak = false;

        try {
            maks(a);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException))
                System.out.println("Kodefeil: Feil unntak for en tom tabell!");
        }

        if (!unntak)
            System.out.println("Kodefeil: Mangler unntak for en tom tabell!");
    }

}
