package uke34;

public class FindMaxNr {
    public static void main(String[] args) {

        int[] vals = {16, 8, 9, 2, 3, 4, 77, 890}; // declare and initialise int array named vals (values)

        int maksverdi = vals[0]; // Vi definerer en maksverdi

        for (int i = 1; i < vals.length; ++i) { // vi starter fra indexnr 1 fordi vi har brukt indexnr 0 (maskverdi)
            int verdi = vals[i];
            if (verdi > maksverdi) {
                maksverdi = verdi;
            }
        }

        System.out.println("Maksverdi i dette arrayet er: " + maksverdi);

    }
}

