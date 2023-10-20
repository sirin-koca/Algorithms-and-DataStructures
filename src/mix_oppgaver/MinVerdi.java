package mix_oppgaver;

import java.util.NoSuchElementException;

public class MinVerdi {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, -5, 6, 7, -8, 9};
        System.out.println(minVerdi(a));
    }
    public static int minVerdi(int[] a){
        if(a.length < 1)
            throw new NoSuchElementException("The list is empthy!");

        int min = a[0];
        for (int i = 0; i < a.length ; i++) {
            if(a[i] < min) min = i;
        }
        return a[min];
    }
}
