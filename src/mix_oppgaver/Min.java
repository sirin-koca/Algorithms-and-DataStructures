package mix_oppgaver;

import java.util.*;

public class Min {

    public static int min(int[] b){
        if(b.length < 1)
            throw new NoSuchElementException("Tabellen b er tom!");

        int m = 0;
        for (int i = 1; i < b.length; i++) {
            if (b[i] < b[m]) m = i;
        }
        return b[m]; // returnerer det minste tallet i tabellen
    }
    public static void main(String[] args) {

        int[] b = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        System.out.print(min(b));
    }
}

