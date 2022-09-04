/*Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 .
Lag en metode long fak(int n) som regner ut n! Hvor mange multiplikasjoner utføres i metoden? */

public class FakultetPermutasjon {
    public static void main(String[] args) {

        System.out.println("n! Fakultet betyr n*(n-1)*...*1. La os teste n=9 => 9! er: " + fak(9));
     }

    public static long fak(int n){
        if (n < 0)
            throw new IllegalArgumentException("n < 0");

        long fak = 1;

        for (int i = 2; i <= n; i++) fak *= i;

        return fak;
    }

}



