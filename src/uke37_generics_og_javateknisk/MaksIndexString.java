package uke37_generics_og_javateknisk;
import java.util.Arrays;

public class MaksIndexString {
    public static void main(String[] args) {
        String[] a = {"Sirin", "Maya", "Teo", "Leo", "Elisabeth", "Jack", "Nala", "Aida"};

        int indexMax = maks(a);
        System.out.println("1) Dette er tabellen vår: " + Arrays.toString(a));
        System.out.println("2) Vi bruker metoden compareTo() for å sammenligne to strenger - hvor de ligger alfabetisk");
        System.out.println("3) Posisjonen / index nummeret til den største verdien i tabellen er: " + indexMax);
        System.out.println("4) Strengen som ligger i posisjon 2 dvs a[2] er: " + a[2]);
        System.out.println("5) T kommer etter S i alfabetet, og derfor har den største verdien.");
    }

    public static int maks (String[] a){

        int m = 0;                  // Index til største verdi (posisjon)
        String maksVerdi = a[0];    // Største verdi
        int n = a.length;

        for (int i = 1; i < n; i++) {
            if(a[i].compareTo(maksVerdi) > 0){  // Denne metoden sammenligner alfabetisk T kommer etter S derfor returnerer 6 som er indexnr til "Teo"
                maksVerdi = a[i];
                m = i;
            }
        }
        return m; // Metoden sammenligner to String-element og returnerer POSISJONEN dvs INDEXNR til største verdi som er av datatypen int , derfor metoden laget av typen int
    }
}
