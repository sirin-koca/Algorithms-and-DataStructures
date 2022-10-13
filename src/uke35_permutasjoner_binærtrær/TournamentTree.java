package uke35_permutasjoner_binærtrær;

import java.util.Arrays;
// Binary tree is also called Tournament tree

public class TournamentTree {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0, 2, 9, 8, 6, 5, 3};

        tournament(a);
        System.out.println(Arrays.toString(a));
    }

    public static int tournament(int[] a) {
        int begin = 5;
        for (int i = begin; i > 0; i--) {
            int id = i;
            int left = 2 * id;
            int right = 2 * id + 1;
            if (a[left] > a[right]) {
                a[id] = a[left];
            } else {
                a[id] = a[right];
            }

        }
        return begin;
    }
}
