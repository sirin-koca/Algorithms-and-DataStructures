package examples;

// The essence of why binary search is its efficiency: with each step, it reduces the problem size by half.
// So even for large arrays, it can find a target (or determine its absence) in a relatively small number of steps.
// the time complexity of the binary search algorithm is O(logn), making it much more efficient than
// a linear search O(n)) for large sorted arrays.

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // A sorted array
        int target = 7;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int lo = 0; // initialized to index 0
        int hi = n-1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1; // this is outside the while loop
    }
}
