
/// /// /// maks-metode versjon 1 /// /// ///

/*Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen
til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste? */

package uke34_algoritmer_bigO_datastrukturer;

public class MaksTest {
    public static void main(String[] args) {
        makstest();

    }

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
            if (a[i] > a[m]){   // Vi vet ikke hvor mange ganger denne kjøres, derfor Hn (det harmoniske tallet)
                m = i;
            }
        }

        // returnerer indeksen/posisjonen til største verdi
        return m;

    }
    public static void makstest(){
        int[] a = {8,3,5,7,9,0,6,10,2,1,4}; // maksverdien 10 er i posisjon 7
        if (maks(a) !=10) // kaller maks-metoden
            System.out.println("Kodefeil: Gir feil posisjon for maksverdien!");
        a = new int[0]; // en tom tabell, lengde lik 0
        boolean unntak = false;
        try
        {
            maks(a); // kaller maks-metoden
        }
        catch (Exception e)
        {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException))
                System.out.println("Kodefeil: Feil unntak for en tom tabell!");
        }
        if (!unntak)
            System.out.println("Kodefeil: Mangler unntak for en tom tabell!");
    }
}


