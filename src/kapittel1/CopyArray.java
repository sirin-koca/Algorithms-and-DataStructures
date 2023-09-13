package kapittel1;

import java.util.Arrays;
import java.util.NoSuchElementException;

// Denne metoden lager en kopi av en eksisterende array og printer ut i motsatt retning.

public class CopyArray {

    public static int[] copy(int[] a){

        int[] b = new int[a.length];

        if (a.length < 1)
            throw new NoSuchElementException("Tabellen er tom!");

        for (int i = 0, j = b.length - 1; i < a.length; i++, j--)
        {
            b[j] = a[i]; // kopierer fra a til b
        }

        System.out.print("int[] b = ");
        System.out.print(Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        copy(a);
    }
}
