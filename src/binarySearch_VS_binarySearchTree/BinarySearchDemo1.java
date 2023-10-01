package binarySearch_VS_binarySearchTree;

public class BinarySearchDemo1 {

    public static int binarySearch(int[] arr, int target) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;  // Return index where target is found

            } else if (arr[mid] < target) {
                left = mid + 1;  // Adjust search to the right side

            } else {
                right = mid - 1;  // Adjust search to the left side
            }
        }
        return -1;  // Target not found in the array
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        for (int x = 0; x < testArray.length; x++) {
            int target = testArray[x];
            System.out.println("For x = " + x + ", target = " + target + ", result = " + binarySearch(testArray, target));
        }
    }
}
