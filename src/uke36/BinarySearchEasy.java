package uke36;

public class BinarySearchEasy {

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 8, 17, 19, 22};

        System.out.println("Target:22 has index nr: " + binarySearch(nums, 22));
        System.out.println("Target:0 has index nr: " + binarySearch(nums, 0));
        System.out.println("Target:8 has index nr: " + binarySearch(nums, 8));
        System.out.println("Target:-1 has index nr: " + binarySearch(nums, -1));
        System.out.println("Target:99 has index nr: " + binarySearch(nums, 99));
    }

    /**
     * Denne metoden returnerer enten index nr,
     * eller -1 hvis tallet vi leter etter ikke eksisterer.
     * Time Complexity : O(logN), Space Complexity: O(1)
     **/
    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;

        while (start <= end) {
            mid = ((end - start) / 2) + start;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }
}

