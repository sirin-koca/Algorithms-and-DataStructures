/* Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner
(og returnerer) posisjonen til den minste verdien i en tabell.
*/

import java.util.Arrays;

public class Min {
    public static int min(int[] a)  {   // a er en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 3;  // indeks til minste verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[m]) m = i;  // indeksen oppdateres
        }
        return m;  // returnerer indeksen/posisjonen til minste verdi

    } // min

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 46};
        a[0]=34;

        for(int i = 0; i<a.length; ++i){
            System.out.println(a[i]);
        }

        Arrays.stream(a).min();
        System.out.println(min(a));
    }
}
