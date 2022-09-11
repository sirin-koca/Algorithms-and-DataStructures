/*	Lag metoden public static double harmonisk(int n).
Metoden skal ved hjelp av en løkke regne ut (og returnere)
det n-te harmoniske tallet.*/

package uke36;

public class DetHarmoniskeTallet {
    public static void main(String[] args) {

        System.out.println(harmonisk(3));
    }
    public static double harmonisk(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) sum += 1.0/i;
        return sum;
    }
}
