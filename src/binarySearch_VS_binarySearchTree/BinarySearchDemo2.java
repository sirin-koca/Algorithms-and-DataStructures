package binarySearch_VS_binarySearchTree;

public class BinarySearchDemo2 {
    public static int binarySearch(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    private static int search(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return search(arr, target, mid + 1, right);
        } else {
            return search(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4, 5, 6};
        System.out.println("Calling the BS-method: " + binarySearch(testArr, 3));;
    }
}
