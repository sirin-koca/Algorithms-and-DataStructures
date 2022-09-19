package uke36;

public class MaxTest {

    public static void main(String[] args) {
        makstest1();
        makstest2();
    } // main end

    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int m = 0;  // indeks til største verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks end

    public static void makstest1() {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 4};  // 10 er i posisjon 6

        if (maks(a) != 6)  // kaller maks-metoden
            System.out.println("Feil posisjon!");

        a = new int[0];  // en tom tabell
        boolean unntak = false;

        try {
            maks(a);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException))
                System.out.println("Kaster feil unntak for en tom tabell!");
        }

        if (!unntak)
            System.out.println("Det skal kastes unntak for en tom tabell!");

    } // makstest1 end

    public static void makstest2()
    {
        int[] a = { 8, 3, 5, 7, 9, 6, 10, 2, 1, 4 };  // 10 er i posisjon 6

        int antallfeil = 0;

        if (maks(a) != 6) // kaller maks-metoden
        {
            System.out.println("Test 1 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 10, 9, 8, 7, 6 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 2 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 1, 2, 3, 4, 5 };

        if (maks(a) != 4) // kaller maks-metoden
        {
            System.out.println("Test 3 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 2, 3, 3, 5, 3, 5, 4 };

        if (maks(a) != 3) // kaller maks-metoden
        {
            System.out.println("Test 4 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{ 2 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 5 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 1, 2 };

        if (maks(a) != 1) // kaller maks-metoden
        {
            System.out.println("Test 6 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 2, 1 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 7 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { -5, -5 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 8 - feil posisjon!");
            antallfeil++;
        }

        a = new int[0];  // en tom tabell
        boolean unntak = false;

        try
        {
            maks(a);  // kaller maks-metoden
        } catch (Exception e)
        {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException))
            {
                System.out.println("Kaster feil unntak for en tom tabell!");
                antallfeil++;
            }
        }

        if (!unntak)
        {
            System.out.println("Det skal kastes unntak for en tom tabell!");
            antallfeil++;
        }

        a = null;
        unntak = false;
        try
        {
            maks(a);  // kaller maks-metoden
        } catch (Exception e)
        {
            unntak = true;
            if (!(e instanceof NullPointerException))
            {
                System.out.println("Kaster feil unntak for en null-tabell!");
                antallfeil++;
            }
        }

        if (!unntak)
        {
            System.out.println("Det skal kastes unntak for en null-tabell!");
            antallfeil++;
        }

        System.out.println("Antall feil: " + antallfeil);
    } // makstest2 end


}
