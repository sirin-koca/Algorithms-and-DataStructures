package mix_oppgaver;

public class Maksverdi {
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++)

            if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi
        // return a[m]; vil returnere selve den største verdien (ikke posisjonen til maksverdien men selve verdien)

    } // maks

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 1, 2, 3, 400};
        System.out.print(maks(a));
    }
}
