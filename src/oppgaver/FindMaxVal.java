package oppgaver;

public class FindMaxVal {
    public static int maxVal(int[] a){
        int maxValue = a[0];
        int n = a.length;
        for (int i = 1; i < n; i++) {
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        int[] a ={2, 5, 3, 7, 990, 10, -1, 999, 0};

        int maxValFinder = maxVal(a);

        System.out.println(maxValFinder);

    }
}
