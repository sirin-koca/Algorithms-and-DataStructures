package sandkassa;

public class TernaryIf2 {
    public static void main(String[] args) {

        int[] list = {2, 5, 3, 7, 8, 9, 23, 12, 14, 56, 7, 8, 1, 78};

        int n = list.length;
        for (int i = 0; i < n; i++) {
            int x = list[i];
            int b = print(x);
            System.out.println(b);
        }
    }

    public static int print(int a) {
        a = (a > 1) ? 100 : -1;  // Ternary if statement --> (Condition) ? true : false;

        /*
        if(a > 1){
            return 100;
        }else{
            return -1;
        }
        */

        return a;
    }

}
