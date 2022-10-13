package uke34_algoritmer_bigO_datastrukturer;

import java.util.Arrays;

public class Rotasjon {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h"};

        System.out.println("This is our String-array: ");
        System.out.println(Arrays.toString(a));

        System.out.println("\nNow we will move every letter 1 position to the right:");
        rotasjon(a);
        System.out.println(Arrays.toString(a));
    }
    public static void rotasjon(String[] a) {
        if(a.length <= 1){
            return;
        }
        int n = a.length; // tabellens lengde er a.length
        String temp = a[n-1]; // temp er den siste verdien i tabellen , siste elementet

        for (int i = n-1; i > 0; i--) {
            a[i] = a[i-1];
        }
       a[0] = temp;

    }
}
