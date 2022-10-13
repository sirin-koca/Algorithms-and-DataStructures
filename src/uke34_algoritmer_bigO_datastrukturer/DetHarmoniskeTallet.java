package uke34_algoritmer_bigO_datastrukturer;/*	Lag metoden public static double harmonisk(int n).
Metoden skal ved hjelp av en løkke regne ut (og returnere)
det n-te harmoniske tallet.*/

public class DetHarmoniskeTallet {
    public static void main(String[] args) {

        System.out.println(String.format("%.2f", harmonisk(5)));
    }
    public static double harmonisk(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) sum += 1.0/i;
        return sum;
    }
}
