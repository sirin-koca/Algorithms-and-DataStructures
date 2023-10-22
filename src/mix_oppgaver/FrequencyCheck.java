package mix_oppgaver;

public class FrequencyCheck {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 0, 5, 6, 6};
        frekvens(array);
    }

    public static void frekvens(int[] a) {
        int len = a.length;
        int n = 1;
        for (int i = 1; i <= len; i++) {
            if (i == len || a[i] != a[i - 1]) {
                System.out.println(a[i - 1] + " exists " + n + " times.");
                n = 1;
            } else {
                n++;
            }
        }
    }
}
