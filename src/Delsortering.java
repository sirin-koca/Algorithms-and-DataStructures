import java.util.Arrays;

public class Delsortering {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Dette er tabellen vår: \n" + Arrays.toString(a));

        delsortering(a);
        System.out.println("\nNå skal vi sortere tabellen slik at alle oddetall samles på venstre og alle partall samles på høyre siden:");
        System.out.println(Arrays.toString(a)); // Sorterer tabellen slik at alle oddetall samles på venstre og alle partall samles på høyre siden av tabellen.
    }

    ///// Oppgave 4 //////////////////////////////////////
    // kvikksortering(), kvikksortering0(), parter(), sParter() er methodene fra kompendiet.
    public static void delsortering(int[] a) {
        int n = a.length;
        int i = 0, j = n - 1;

        if (a.length == 0) return;

        while (i <= j) {
            if ((a[i] % 2 == 0) && !(a[j] % 2 == 0)) {
                bytt(a, i++, j--);
            } else if (a[i] % 2 == 0) {
                j--;
            } else if (!(a[j] % 2 == 0)) {
                i++;
            } else if (!(a[i] % 2 == 0) && (a[j] % 2 == 0)) {
                i++;
                j--;
            }
        }
        kvikksortering(a,0,i);
        kvikksortering(a,i,n);
    }

    //////////////KODEN FRA KOMPENDIET //////////////////

    private static void kvikksortering0(int[] a, int i, int j)  // en privat metode
    {
        if (i >= j) return;  // a[v:h] er tomt eller har maks ett element
        int k = sParter(a, i, j, (i + j)/2);  // bruker midtverdien
        kvikksortering0(a, i, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, j);     // sorterer intervallet a[k+1:h]
    }


    private static int sParter(int[] a, int i, int j, int indeks)
    {
        bytt(a, indeks, j);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter(a, i, j - 1, a[j]);  // partisjonerer a[v:h − 1]
        bytt(a, pos, j);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien
    }

    private static int parter(int[] a, int i, int j, int skilleverdi)
    {
        while (true)                                  // stopper når v > h
        {
            while (i <= j && a[i] < skilleverdi) i++;   // h er stoppverdi for v
            while (i <= j && a[j] >= skilleverdi) j--;  // v er stoppverdi for h

            if (i < j) bytt(a,i++,j--);                 // bytter om a[v] og a[h]
            else  return i;  // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }

    public static void kvikksortering(int[] a, int fra, int til) // a[fra:til>
    {
        kvikksortering0(a, fra, til - 1);  // v = fra, h = til - 1
    }

    public static void kvikksortering(int[] a)   // sorterer hele tabellen
    {
        kvikksortering0(a, 0, a.length - 1);
    }

public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
}

}
