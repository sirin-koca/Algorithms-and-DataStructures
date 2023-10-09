package examples;

//  We will implement the Linear Search which runs in O(n) time for a list of size n,
//  Binary Search is a more efficient way to search for an item in a sorted list. It runs in O(log n) time.

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 6;

        int retRn = linearSearch(arr, target);

        if(retRn != -1){
            System.out.println("Target is " + target + " found at index nr " + retRn);
        } else {
            System.out.println(target + " is not found in the array");
        }
    }

    public static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target) return i; // If target found, returns the index of it
        }
        return -1; // target not found
    }
}

