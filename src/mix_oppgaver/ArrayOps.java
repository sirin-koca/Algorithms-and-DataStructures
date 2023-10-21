package mix_oppgaver;

public class ArrayOps {
    public static void main(String[] args) {
        int[] x = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 15};

        printMyArr(x);
        sumMyArr(x);
        avgMyArr(x);
        swapElementMyArr(x);
        reverseMyArr(x);
        reversePrintMyArr(x);

        int min = findMin(x);
        System.out.println("\nMin num: " + min);

        int max = findMax(x);
        System.out.println("Max num: " + max);

        findMinMax(x);

        findSecondLargest(x);
    }

    public static void printMyArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
    }

    public static void sumMyArr(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("The sum of the elements in this atray: " + sum);
    }

    public static void avgMyArr(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int avg = sum / a.length;
        System.out.println("The avarage of the elements in this atray: " + avg);
    }

    public static void swapElementMyArr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
           i++;  // skip the next element
        }
        // Print the array
        for (int val : a) {
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    public static void reverseMyArr(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public static void reversePrintMyArr(int[] x){
        for(int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + ", ");
        }
    }

    public static int findMin(int[] x) {
        int min = x[0];
        for(int i = 0; i < x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public static int findMax(int[] x){
        int max = x[0];
        for (int i = 1; i < x.length ; i++) {
            if(x[i] > max){
                max = x[i];
            }
        }
        return max;
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


    public static void findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array needs at least two elements");
            return;
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == max) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("The second largest number is: " + secondMax);
        }
    }

}
