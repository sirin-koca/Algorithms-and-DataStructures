public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubble(a);

        // for (int i = 0; i < a.length; i++) { }
        // k = a[i]
        // for(int k : a){ System.out.println(k);}
    }

    // Denen metoden flytter største tallet 9 helt bakerts i listen.
    // For å visualisere, printer ut hver iterasjon
    public static void bubble(int[] a) {
        int begin = 0;
        int end = a.length;

        for (int i = 0; i < end-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(1); // for å få 1 på slutten uten komma.

        System.out.println();

        for (int i = begin; i < end - 1; i++) {
            if (a[i] > a[i + 1]) {
                // BYTT!
                int temp = a[i]; // vi må bruke en hjelpevariabel "temp"
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

            System.out.print(a[0]);
            for (int j = 1; j < end; j++) {
                System.out.print(", " + a[j]);
            }
            System.out.println();

        }
    }
}
