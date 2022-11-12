package uke40_Recap;

public class BinarySearch {

    //Binary Search O(log n)
    //Binary Search - Recursive
    int search, start, end = 0;
    public int binarySearchRec(int[] a, int search, int start, int end){
        int middle = start + ((end - start) / 2);
        if (end < start) {
            return -1;
        }
        if (search == a[middle]) {
            return middle;
        } else if (search < a[middle]) {
            return binarySearchRec(a, search, start,middle - 1);
        } else {
            return binarySearchRec(a, search, middle + 1, end);
        }
    }
    // Binary Search - Iterative
    public int binarySearchItr(int target, int[] a){
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int middle = start + ((end - start) / 2);
            if (target == a[middle]) {
                return target;
            } else if (search < a[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return target;
    }

    public static void main(String[] args) {
       int[] a ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30 , 40 , 50 , 60, 70, 80, 90};
       BinarySearch bns = new BinarySearch();

       int result1 = bns.binarySearchRec(a, 13, 0, a.length);
        System.out.println("Result1: " + result1);

        int result2 = bns.binarySearchItr(8, a);
        System.out.println("result2: " + result2);

    }
}
