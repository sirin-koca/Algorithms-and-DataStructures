package uke37;

import java.util.Arrays;

public class MaksVerdiDesimalTall {
    public static void main(String[] args) {
        double[] a = {0.2, 1.3, 1.9, 2.8, 3.2, 7.1};
        int maks = maks(a);
        System.out.println("1) Dette er tabellen vår: " + Arrays.toString(a));
        System.out.println("2) Posisjonen / index nummeret til den største verdien i tabellen er: " + maks);
        System.out.println("3) " + a[5] + " er den største verdien i denne tabellen og den har index nummer: " + maks);
    }

    public static int maks (double[] a){
        int m = 0; // Index til største verdi (posisjon)
        double maksVerdi = a[0]; // Største verdi
        int n = a.length;

        for (int i = 1; i < n; i++) {
            if(a[i] > maksVerdi){
                maksVerdi = a[i];
                m = i;
            }
        }
        return m; // Returnerer posisjonen til største verdi - returnerer int , derfor metoden er av typen int
    }
}
