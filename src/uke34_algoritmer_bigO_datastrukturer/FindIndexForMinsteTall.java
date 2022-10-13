package uke34_algoritmer_bigO_datastrukturer;

public class FindIndexForMinsteTall {

    public static void main(String[] args) {
        int[] a = {98, 4, 17, 10, 6, -20, 1, 0, 11, -153, 3, 18, 9, 2, -7, 19};

        int minIndex = findMinIndex(a);
        System.out.println(minIndex);

    }

    // Method: index finder for the min. value
    public static int findMinIndex(int[] a){
        int minV = a[0];  // accessing array-value
        int minI = 0;   // index number
        int n = a.length;

        for (int i = 1; i < n; i++) {
            if(a[i] < minV ){
                minV = a[i];
                minI = i;
            }
        }
        return minI;
    } // method end.


    /**
     * public static int min(int[] a){
     *         int minValue = a[0];
     *         int minIndex = 0;
     *
     *         for (int i = 1; i < a.length; i++) {
     *             int value = a[i];
     *             int index = i;
     *
     *             if(value < minValue){
     *                 minValue = value;
     *                 minIndex = index;
     *             }
     *         }
     *
     *     return minIndex;
     *
     *     }
     */


}
