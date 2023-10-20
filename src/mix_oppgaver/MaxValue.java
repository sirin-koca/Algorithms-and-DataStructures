package mix_oppgaver;

import java.util.NoSuchElementException;

public class MaxValue {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16, -18};

        System.out.println(minMaksVerdi(a));
    }
    public static int minMaksVerdi(int[] a){
        if(a.length < 1)
            throw new NoSuchElementException("The list is empthy!");

        int m = 0; // maksverdi
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[m]) m = i;
        }
        return a[m];

    }
}
