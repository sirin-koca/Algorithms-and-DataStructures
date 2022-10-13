
/// /// /// maks-metode versjon 1 /// /// ///

/*Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen
til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste? */

package uke34_algoritmer_bigO_datastrukturer;
public class MaksV1 {

    // Statisk metode som tar int array som parameter
    // a er en heltallstabell (int array)

    public static int maks(int[] a)  {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        // indeks til foreløpig største verdi (m for maks)
        int m = 0;

        // obs: starter med i = 1
        for (int i = 1; i < a.length; i++){
            // indeksen oppdateres
            if (a[i] > a[m]){
                m = i;
            }
        }

        // returnerer indeksen/posisjonen til største verdi
        return m;

    }
}


