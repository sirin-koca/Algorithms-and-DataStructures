package examples;

import java.util.Arrays;

public class TurneringsTree {
    public static void main(String[] args) {
        int[] a = {2, 9, 8, 6, 5, 3};
        System.out.println(Arrays.toString(turnering(a)));
    }

    public static int[] turnering(int[] a){
        int n = a.length;
        int begin = (n / 2) - 1;

        for (int i = begin; i >= 0; i--) {
            int left = 2 * i;
            int right = 2 * i + 1;

            // Check if indices are in range
            if(a[left] > a[right]){
                a[i] = a[left];
            } else a[i] = a[right];
        }

        return a;
    }
}
