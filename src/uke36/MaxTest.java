package uke36;

import java.util.OptionalInt;

// krever import java.util.OptionalInt;
/**
 * makstest() tester om maks-metoden kaster et unntak for en tom tabell og om unntaket er av rett type. Dette vil
 * stemme for den versjonen av maks-metoden som er gitt i Programkode 1.1.2, men ikke for de to versjonene i
 * Programkode 1.1.4 og Programkode 1.1.5. Se Oppgave 1 - 3. Det er imidlertid mange situasjoner der det ikke er
 * gunstig å kaste et unntak for en tom tabell. En mulighet er da å signalisere dette ved hjelp av en bestemt returverdi.
 * I maks-metoden kunne vi f.eks. vi bruke -1 (eller en annen negativ verdi) siden -1 ikke kan være en tabellindeks.
 * Men hvis vi har en maks-metode som gir oss den største verdien (dvs. verdien og ikke posisjonen), kan ikke -1 brukes.
 * Hvis tabellen a inneholder negative verdier, vil vi da ikke kunne vite om -1 er den største av dem eller
 * om -1 signaliserer en «feil».

 * Vi kan løse dette problemet ved å la metoden returnere et objekt. Det skal inneholde korrekt resultat hvis alt
 * fungerer som normalt, men ingenting hvis det oppstår en feil. Vi kan lage en egen klasse for dette, men det er
 * unødvendig siden det allerede finnes en slik klasse i Java. Det er OptionalInt. Det engelske ordet optional kan
 * oversettes med valgfri eller frivillig. Her er imidlertid OptionalInt «a container object which may or may not
 * contain an int value». Klassen har ingen offentlig konstruktør, men derimot to konstruksjonsmetoder, dvs.
 * to statiske metoder som begge returnerer en instans av klassen. Flg. metode finner indeks til største verdi i
 * en tabell og bruker en OptionalInt som returverdi (se også Avsnitt 1.1.11):
 */

public class MaxTest {

    public static void main(String[] args) {
        makstest1();
        makstest2();

        int[] a = {8,3,5,7,9,6,10,2,1,4}, b = {};  // to tabeller

        System.out.println(maksOptional(a));       // utskrift: OptionalInt[6]
        System.out.println(maksOptional(b));       // utskrift: OptionalInt.empty
    } // main end

    // krever import java.util.OptionalInt;

    public static OptionalInt maksOptional(int[] a)           // indeks til største verdi
    {
        if (a.length < 1) return OptionalInt.empty();   // en konstruksjonsmetode

        int m = 0, maksverdi = a[0];                    // startindeks og verdi

        for (int i = 1; i < a.length; i++)              // starter med i = 1
        {
            if (a[i] > maksverdi)
            {
                m = i;
                maksverdi = a[i];                    // oppdaterer
            }
        }

        return OptionalInt.of(m);                       // en konstruksjonsmetode
    }
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int m = 0;  // indeks til største verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m])
                m = i;  // indeksen oppdateres
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

    public static void makstest2() {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 4};  // 10 er i posisjon 6

        int antallfeil = 0;

        if (maks(a) != 6) // kaller maks-metoden
        {
            System.out.println("Test 1 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{10, 9, 8, 7, 6};

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 2 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{1, 2, 3, 4, 5};

        if (maks(a) != 4) // kaller maks-metoden
        {
            System.out.println("Test 3 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{2, 3, 3, 5, 3, 5, 4};

        if (maks(a) != 3) // kaller maks-metoden
        {
            System.out.println("Test 4 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{2};

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 5 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{1, 2};

        if (maks(a) != 1) // kaller maks-metoden
        {
            System.out.println("Test 6 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{2, 1};

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 7 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{-5, -5};

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 8 - feil posisjon!");
            antallfeil++;
        }

        a = new int[0];  // en tom tabell
        boolean unntak = false;

        try {
            maks(a);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException)) {
                System.out.println("Kaster feil unntak for en tom tabell!");
                antallfeil++;
            }
        }

        if (!unntak) {
            System.out.println("Det skal kastes unntak for en tom tabell!");
            antallfeil++;
        }

        a = null;
        unntak = false;
        try {
            maks(a);  // kaller maks-metoden
        } catch (Exception e) {
            unntak = true;
            if (!(e instanceof NullPointerException)) {
                System.out.println("Kaster feil unntak for en null-tabell!");
                antallfeil++;
            }
        }

        if (!unntak) {
            System.out.println("Det skal kastes unntak for en null-tabell!");
            antallfeil++;
        }

        System.out.println("Antall feil: " + antallfeil);
    } // makstest2 end


}
