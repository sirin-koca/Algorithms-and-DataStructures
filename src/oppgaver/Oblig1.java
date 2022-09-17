package oppgaver;

import java.util.NoSuchElementException;

public class Oblig1 {

    ///// Oppgave 1 //////////////////////////////////////

    public static int maks(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen a er tom!");
        }

        int n = a.length;
        int maksVerdi = a[n - 1];

        for (int i = 1; i < n ; i++) {
            if (a[i - 1] > a[i]) {
                bytt(a, i - 1, i);
            }
        }
        return a[n - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen a er tom!");
        }
        int antall = 0;
        int n = a.length;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                bytt(a, i - 1, i);
                antall++;
            }
        }
        return antall;
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        int antall_ulike = 1;
        if (a.length == 0) {
            return 0;
        }
        if (a.length == 1) {
            return 1;
        }
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Det er ikke sortert stigende!!");
            }
            if (a[i] != a[i + 1]) {
                antall_ulike++;
            }
            i++;
        }

        return antall_ulike;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length < 2) return a.length;

        int antallUlike = 1;
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (; j < i; j++) {
                int verdi = a[i];
                if (a[j] == verdi) break;
            }
            if (j == i) antallUlike++;
        }
        return antallUlike;

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
        kvikksortering(a, 0, i);
        kvikksortering(a, i, n);
    }

    //////////////KODEN FRA KOMPENDIET //////////////////

    private static void kvikksortering0(int[] a, int i, int j)  // en privat metode
    {
        if (i >= j) return;  // a[v:h] er tomt eller har maks ett element
        int k = sParter(a, i, j, (i + j) / 2);  // bruker midtverdien
        kvikksortering0(a, i, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, j);     // sorterer intervallet a[k+1:h]
    }


    private static int sParter(int[] a, int i, int j, int indeks) {
        bytt(a, indeks, j);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter(a, i, j - 1, a[j]);  // partisjonerer a[v:h − 1]
        bytt(a, pos, j);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien
    }

    private static int parter(int[] a, int i, int j, int skilleverdi) {
        while (true)                                  // stopper når v > h
        {
            while (i <= j && a[i] < skilleverdi) i++;   // h er stoppverdi for v
            while (i <= j && a[j] >= skilleverdi) j--;  // v er stoppverdi for h

            if (i < j) bytt(a, i++, j--);                 // bytter om a[v] og a[h]
            else return i;  // a[v] er nåden første som ikke er mindre enn skilleverdi
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


    /////////////////TIL HER ////////////////////////////

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length <= 1) {
            return;
        }
        int n = a.length;
        char temp = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;

    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        if (a.length <= 1) {
            return;
        }
        k %= a.length;
        while (k < 0) {
            k += a.length;
        }
        reversereArray(a, 0, a.length - 1);
        reversereArray(a, 0, k - 1);
        reversereArray(a, k, a.length - 1);

    }

    public static void reversereArray(char[] a, int start_index, int end_index) {
        while (start_index < end_index) {
            char temp = a[start_index];
            a[start_index] = a[end_index];
            a[end_index] = temp;
            end_index--;
            start_index++;
        }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {

        int m = Math.min(s.length(), t.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(s.charAt(i)).append(t.charAt(i));
        }
        if (s.length() >= m) {
            for (int i = m; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }  // tar med resten
        }
        if (t.length() >= m) {
            for (int i = m; i < t.length(); i++) {
                sb.append(t.charAt(i));
            }  // tar med resten

        }

        return sb.toString();
    }

    /// 7b)
    public static String flett(String... s) {
        if (s.length == 0) {
            return "";
        }

        int l = s[0].length();
        for (int i = 1; i < s.length; i++) {
            int lengde = s[i].length();
            if (l < lengde) {
                l = lengde;
            }
        }
        StringBuilder a = new StringBuilder();
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < s.length; i++) {
                if (j < s[i].length()) {
                    a = a.append(s[i].charAt(j));
                }
            }
        }
        return a.toString();

    }


    ///// Oppgave 8 //////////////////////////////////////
    private static int min(int[] a, int fra, int til) {
        int minverdi = a[fra];
        int ind = fra;
        for (int i = fra; i < til; i++) {
            if (minverdi > a[i]) {
                ind = i;
                minverdi = a[ind];
            }
        }
        return ind;
    }

    private static void bytt(int a[], int i, int j) {
        int m = a[i];
        a[i] = a[j];
        a[j] = m;
    }

    public static int[] indekssortering(int[] a) {
        if (a == null) {
            throw new UnsupportedOperationException("Illegal Table");
        }
        int[] index = new int[a.length];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            int min = min(b, i, b.length);
            bytt(b, i, min);

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] == b[i]) {
                    index[i] = j;
                }

            }
        }
        return index;
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        if (a.length < 3) {
            throw new NoSuchElementException("arrayen har mindre enn 3 elemenetr");
        }
        int[] c = indekssortering(new int[]{a[0], a[1], a[2]});
        int m = c[0];
        int nm = c[1];
        int tm = c[2];
        int minverdi = a[m];
        int nesteMinverdi = a[nm];
        int tredjeMinverdi = a[tm];
        for (int i = 3; i < a.length; i++) {
            int verdi = a[i];
            if (verdi < tredjeMinverdi) {
                if (verdi < nesteMinverdi) {
                    if (verdi < minverdi) {
                        tm = nm;
                        nm = m;
                        m = i;
                        tredjeMinverdi = nesteMinverdi;
                        nesteMinverdi = minverdi;
                        minverdi = verdi;
                    } else {
                        tm = nm;
                        nm = i;
                        tredjeMinverdi = nesteMinverdi;
                        nesteMinverdi = verdi;
                    }
                } else {
                    tredjeMinverdi = verdi;
                    tm = i;
                }
            }
        }
        int[] b = {m, nm, tm};
        return b;
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        return bokstav <= 'Z' ? bokstav - 'A' : bokstav == 'Æ' ? 26 : bokstav == 'Ø' ? 27 : 28;
    }

    public static boolean inneholdt(String a, String b) {

        if (b.length() < a.length()) {
            return false;
        }
        int[] antallBokstaver = new int[29];

        for (int i = 0; i < a.length(); i++) {
            antallBokstaver[bokstavNr(a.charAt(i))]++;
        }
        for (int i = 0; i < b.length(); i++) {
            antallBokstaver[bokstavNr(b.charAt(i))]--;
        }
        for (int j : antallBokstaver) {
            if (j > 0) {
                return false;
            }
        }

        return true;
    }


}  // Oblig1

