package uke36;

public class IsSorted {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 7, 5, 9, 0};
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Er array-a sortert? : " + erSortert(a));
        System.out.println("Er array-b sortert? : " + erSortert(b));
    }
    public static boolean erSortert(int[] a)  // legges i samleklassen Tabell
    {
        for (int i = 1; i < a.length; i++)      // starter med i = 1
            if (a[i-1] > a[i]) return false;    // en inversjon
        return true;
    }
}
