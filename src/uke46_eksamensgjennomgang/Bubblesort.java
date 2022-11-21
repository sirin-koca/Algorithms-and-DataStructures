package uke46_eksamensgjennomgang;

import java.util.Arrays;
import java.util.Random;

public class Bubblesort {
    public static void main(String[] args) {
        Random randy = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = randy.nextInt(50);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println("after sorting: " + boble(nums) + "end:");

        for (int i = 1; i < nums.length; i++)
        {
            int antall = boble(nums);  // antall ombyttinger
            System.out.println(i + ". " + Arrays.toString(nums));
        }
    }

    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int boble(int[] a){
        int antall = 0;

        for (int i = 1; i < a.length ; i++) {
            int j = 0;
            if(a[i-1] > a[i]){
                swap(a,i-1 , j);
                antall++;
            }
        }
        return antall;
    }

}
