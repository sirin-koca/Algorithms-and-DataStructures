package uke37;

public class tverrSum {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(tverrsum(9000));
    }
    public static int tverrsum(int n){
        System.out.println("Tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsum(n / 10) + (n % 10);
        System.out.println("Tverrsum(" + n + ") er ferdig!");
        return sum;
    }

}
