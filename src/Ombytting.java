import java.util.NoSuchElementException;

public class Ombytting {
    public static void main(String[] args) {
        int[] a = {123, 2, 34, 4, 55, 6, 7, 8, 989, 10};

        System.out.println("Maksverdien i denne tabellen er: " + maks(a));
        System.out.println("Antall ombyttinger: " + ombyttinger(a));
    }

    public static int maks(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen a er tom!");
        }

        int n = a.length;
        int maksVerdi = a[n - 1];

        for (int i = 1; i < a.length; i++) {
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

    public static void bytt(int[] a, int i, int j) {
        int m = a[i];
        a[i] = a[j];
        a[j] = m;
    }
}




