package uke46_eksamensgjennomgang;

class StringString {
    public static int maks(String[] a) {
        int m = 0;                          // indeks-nr. til største verdi
        String maksverdi = a[0];            // største verdi

        int n = a.length;

        for (int i = 1; i < n; i++) {
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        }
        return m;  // returnerer posisjonen til største verdi
    }
}

public class StringMaks {
    public static void main(String[] args) {
        String[] myArray = {"zoo", "hello", "dear", "how", "are", "you", "test"};
        int test = StringString.maks(myArray);
        System.out.println(test);

    }
}