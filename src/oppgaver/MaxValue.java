package oppgaver;

import java.util.NoSuchElementException;

public class MaxValue {

    public static int maksReturn(int[] a){
        if (a.length < 1){
            throw new NoSuchElementException("Something went wrong, please try again!");
        }

        int n = a.length;
        int maksVerdi = a[0];
        for (int i = 1; i < n; i++) {
            int verdi = a[i];
            if (verdi > maksVerdi) {
                maksVerdi = verdi;
                // if(a[i] > a[index]) maksIndex = index;
            }
        }
        return maksVerdi;
    }

    public static void main(String[] args) {

        // test cases:
        int[] a = {100, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maksReturn(a));

        int[] b = {1, 200, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maksReturn(b));

        int[] c = {1, 2, 300, 4, 5, 6, 7, 8, 9};
        System.out.println(maksReturn(c));

        int[] d = {1, 2, 3, 400, 5, 6, 7, 8, 9};
        System.out.println(maksReturn(d));

        int[] e = {1, 2, 3, 4, 500, 6, 7, 8, 9};
        System.out.println(maksReturn(e));
    }
}


