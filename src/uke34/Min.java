/* Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner
(og returnerer) posisjonen til den minste verdien i en tabell.
*/

package uke34;

public class Min {
    public static void main(String[] args) {

        int[] a = {2, 5, 8, -34, 21, 0, 4, 3, -5, 9};
        System.out.println("Indexen til det minste tallet i a-arrayet er : " + min(a));

    }

    public static int min(int[] a) {   // a er en heltallstabell

        int n = a.length;
        if (n < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int m = 0;  // indeks til minste verdi
        for (int i = 1; i < n; i++) { // obs: starter med i = 1
            if (a[i] < a[m]) {
                m = i; // indeksen oppdateres
            }
        }
        return m;  // returnerer indeksen/posisjonen til minste verdi

    } // min

}
