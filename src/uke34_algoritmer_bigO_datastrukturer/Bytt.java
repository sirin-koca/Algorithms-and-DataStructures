package uke34_algoritmer_bigO_datastrukturer;

public class Bytt {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        bytt(a, 7, 1);
        for (int i = 0; i < 9; i++) {
            System.out.println(a[i]);
        }
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
