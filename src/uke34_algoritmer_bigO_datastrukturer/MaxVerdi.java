// Den største verdien i en tabell

package uke34_algoritmer_bigO_datastrukturer;

public class MaxVerdi {
    public static void main(String[] args) {
        int[] a = {3, 8, 230, 6, 97, 18};
        System.out.println(maks(a));
    }
    public static int maks(int[] a) {
        int maksverdi = a[0]; // Initialiser maksverdi
        for (int i = 1; i < a.length; i++) { // Løkke som går gjennom alle elementer i a
            int verdi = a[i];
            if (verdi > maksverdi) { // Sjekk om a[i] er større enn maksverdi
                maksverdi = verdi; // Oppdaterer maksverdi
            }
        }
        return maksverdi; // Returnerer maksverdi
    }
}

