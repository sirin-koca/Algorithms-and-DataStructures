/* Lag metoden public static double euler(int n). Den skal returnere differansen mellom Hn og log(n).
I Java gir Math.log(n) oss den naturlige logaritmen til n.
Hvor stor må n være for at euler(n) skal returnere et tall som starter med 0,577 som de tre første desimalene? */

// Euler's constant = 0.577
// Euler's number = 2.718

package uke35;

public class EulerSConstant {

    public static void main(String[] args) {
        System.out.println(euler(638));
    }

    public static double harmonisk(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) sum += 1.0/i;
        return sum;
    }

    public static double euler(int n)
    {
        return harmonisk(n) - Math.log(n);
    }
    // n = 637 gir euler(n) = 0.5780003888865783
    // n = 638 gir euler(n) = 0.577999159233074
}
