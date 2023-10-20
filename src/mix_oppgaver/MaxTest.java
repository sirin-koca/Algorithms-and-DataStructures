package mix_oppgaver;

public class MaxTest {
    public static void main(String[] args) {

        int[] x = {1, 9, 2, 33, 100, 4, 5, 7, 8, 6, 122};

        int maxNum = maxFind(x);
        System.out.println(maxNum);
    }

    public static void bytt(int[] x, int a, int b){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static void omsjekk(int[] x){
        for (int i = 0; i < x.length-1; i++) {
            if(x[i] > x[i+1]){
                bytt(x, i , i+1);
            }
        }
    }

    public static int maxFind(int[] x){
        omsjekk(x);
        return x[x.length-1];
    }
}
