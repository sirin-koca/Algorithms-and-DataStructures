package uke35;

public class MaxIndex {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 1, 89, 67, 5, 133, 0};

        int index = maks(a);
        System.out.println("Indeksen til den største verdien i tabellen er: [" + index + "]");
    }


    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }

        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

}