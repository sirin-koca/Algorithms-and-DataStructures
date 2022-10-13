package uke38_rekursjon_flerdimensjonelle_tabeller;

/**
 * REKURSJON
 * en funksjon som kaller seg selv! ava eks: n! factorial
 * <p>
 * Krav til rekursjon funksjon:
 * 1) funksjonen må ha et eller flere basis tilfeller som kan behandles uten nye rekursive kall
 * 2) Funksjonen må kalle seg selv på tilfeller som er "enklere" enn det den ble kalt med, dvs at vi må endre argumenten når vi kaller metoden på nytt, (slik at 
 * vi ungår evig-rekursjon (break), slik at basistilfellet nåes til slutt.
 * <p>
 * Uten disse får vi en uendelig rekursjon! (StackOverflow)
 */

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("Rekursjon!");

        // Fakultet
        // 5! = 5*4*3*2*1 = 120

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "! = " + factorial(i));

        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } // basistilfellet
        return n * factorial(n - 1);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println(n + " break!");
            return;
        }
        System.out.println(n + " ... ");
        countdown(n - 1);
    }

}
