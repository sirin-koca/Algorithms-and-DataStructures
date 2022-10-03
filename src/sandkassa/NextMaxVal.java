package sandkassa;

import static java.lang.Math.*;

public class NextMaxVal {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 200, 300, 400, 10, 42, 56, -1, 500};
        int nextMax = nextMaxMethod(a);
        System.out.println(nextMax);
    }

    // For å finne nestMaks verdi må vi ha to verdier å sammenligne med hverandre
    public static int nextMaxMethod(int[] a){
        int nextMax = min(a[0], a[1]); // nextMax = 1 (a[0])
        int max = max(a[0], a[1]);  // max = 2 (a[1])
        int n = a.length;
        for (int i = 2; i < n ; i++) {
                if(a[i] > nextMax){
                    if(a[i] > max){
                        nextMax = max;
                        max = a[i];
                }else {
                        nextMax = a[i];
                    }
            }
        }
        return nextMax;
    }
}
