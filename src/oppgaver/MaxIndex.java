package oppgaver;

public class MaxIndex {
    public static int maxIndex(int[] a){

        int n = a.length;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if(a[i] > a[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {

        // test cases:
        int[] a = {100, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxIndex(a));

        int[] b = {1, 200, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxIndex(b));

        int[] c = {1, 2, 300, 4, 5, 6, 7, 8, 9};
        System.out.println(maxIndex(c));


    }
}
