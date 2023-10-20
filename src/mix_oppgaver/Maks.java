package mix_oppgaver;

import java.util.*;

public class Maks {
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks(posisjonen) til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi
        // return a[m] vil returnere selve største verdien
    } // maks

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(maks(a));
    }
}
