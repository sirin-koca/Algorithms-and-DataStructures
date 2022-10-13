package uke34_algoritmer_bigO_datastrukturer;/*	Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2
returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til
 den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2};
 Hvor mange sammenligninger bruker metoden din? */


public class MinMaks {

    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
            else if (verdi < minverdi) {minverdi = verdi; mi = i;}
        }

        return new int[]{mi,ma};
    }

}



