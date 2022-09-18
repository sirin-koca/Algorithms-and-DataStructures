package uke36;

public class Bubble {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 4, 7, 6};

        bubble(a);

        // for (int i = 0; i < a.length; i++) { }
        // k = a[i]

        // for(int k : a){ System.out.println(k);}

    }

    public static void bubble(int[] a){
        int begin = 0;
        int end = a.length-1;

        for (int i = begin; i < end ; i++) {
            if(a[i] > a[i+1]){

                // BYTT!
                int temp = a[i]; // vi må bruke en hjelpevariabel "temp"
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            else{
                // Gjør ingenting - fordi da er ingen inverjson
            }

            System.out.print(a[0]);
            for (int j = 0; j < a.length; j++) {
                System.out.print(", " + a[j]);
            }
            System.out.println();
        }
        a[0] = 99;
    }
}
