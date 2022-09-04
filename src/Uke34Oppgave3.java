/*    Oppgave 3

    Det gjøres ved å endre sammenligningen if (a[i] > a[m]) til if (a[i] >= a[m]).

    En alternativ måte er å gå gjennom tabellen motsatt vei, dvs. starte lengst til høyre og så gå mot venstre. Det kan kodes slik:
*/

public class Uke34Oppgave3 {

    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int m = a.length - 1;  // indeks til største verdi

        for (int i = a.length - 2; i >= 0; i--) // starter nest bakerst
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // mak

}

