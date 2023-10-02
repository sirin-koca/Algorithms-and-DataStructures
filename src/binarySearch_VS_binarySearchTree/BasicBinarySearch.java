package binarySearch_VS_binarySearchTree;

class BasicBinarySearch {
    public static int binarySearch(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;  // target was not found in the array
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(binarySearch(a, target));  // should print 2 (index of 3)
    }
}

/*
Explained:

We call the function with an array and a target value: binarySearch(a, target).

Inside the function, the code checks each "middle" value (a[mid]) of the currently considered portion of the array
to see if it matches the target.

If a[mid] is equal to the target, then mid (which is the index) is returned.

If a[mid] is less than the target, it means the target (if it's in the array) must be in the right half of
the currently considered portion, so the left boundary is adjusted to mid + 1.

If a[mid] is greater than the target, it means the target (if it's in the array) must be in the left half of
the currently considered portion, so the right boundary is adjusted to mid - 1.

If after considering all possible portions of the array, the target is not found, -1 is returned to indicate
the value isn't present in the array.

So, to summarize: target is the value you're searching for. The function returns the index of that value
in the array (or -1 if the value isn't in the array).
 */