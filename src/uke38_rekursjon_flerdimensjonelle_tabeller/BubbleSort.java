package uke38_rekursjon_flerdimensjonelle_tabeller;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

		/*
		// Enhanced For-Loop
		for (int j : arr) {
		System.out.print(j + " ");
		}
		* */
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 42, 6, 1, 3, 2};
        bubbleSort(arr);
        printArray(arr);
    }
}
