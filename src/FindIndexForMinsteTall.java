public class FindIndexForMinsteTall {

    int[] a={8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

    public int min(int[] a){
        int minValue = a[0];
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int index = i;

            if(value < minValue){
                minValue = value;
                minIndex = index;
            }
        }

    return minIndex;

    }
}
