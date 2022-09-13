package Oppgaver;

public class SirinO1 {
    public static void main(String[] args) {
        int[] a ={90, 18, 7, 6, 5, 14, 3, 2, 1 };
        System.out.println("maks a " + maks(a));
        System.out.println("antall ombyttingger" + ombyttinger(a));
    }

    public static int maks(int[] a) {

        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int maksVerdi = a[0];
        for (int i = 1; i < a.length; i++) {
            if ( a[0] > a[1] ) a[1] = a[0];
            if ( a[1] > a[2] ) a[2] = a[1];
            if ( a[i] > a.length ) a[i] = a.length;
        }
        return maksVerdi;
    }


    public static int ombyttinger(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > a[i++] ) antall++;
        }
        return antall;
    }
}
