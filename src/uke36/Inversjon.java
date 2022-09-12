package uke36;

public class Inversjon {
    public static void main(String[] args) {
        int[] a = {9, 1, 2, 6, 3, 7, 0};
        System.out.println(inversjoner(a));
    }
    public static int inversjoner(int[] a)
    {
        int antall = 0;  // antall inversjoner
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) antall++;  // en inversjon siden i < j
            }
        }
        return antall;
    }
}
