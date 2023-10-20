package mix_oppgaver;

import java.util.NoSuchElementException;

public class MinValue {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, -12};
        System.out.println(minVerdi(a));
    }

    public static int minVerdi(int[] a){
        if(a.length < 1)
            throw new NoSuchElementException("The list is empthy!");

        int m = 0;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] < a[m]) m = i;
        }
        return a[m]; // returnerer den minste verdien i tabellen
    }
}
