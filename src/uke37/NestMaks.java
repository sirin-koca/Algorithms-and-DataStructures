package uke37;

public class NestMaks {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 6, 8};
        System.out.println(nestMaks(a));
    }

    public static int[] nestMaks(int[] a) // en turnering
    {
        int n = a.length; // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2 * n]; // turneringstreet

        System.arraycopy(a, 0, b, n, n); // legger a bakerst i b

        for (int k = 2 * (n - 2); k > 1; k -= 2) // lager turneringstreet
            b[k / 2] = Math.max(b[k], b[k + 1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2 * (n - 1), k = 2; k < m; k *= 2) {

            int tempverdi = b[k + 1]; // ok hvis maksverdi er b[k]

            if (maksverdi != b[k]) {
                tempverdi = b[k];
                k++;
            }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }
        return new int[]{maksverdi, nestmaksverdi}; // størst og nest størst } // nestMaks
    }
}

