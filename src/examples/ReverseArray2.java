package examples;

public class ReverseArray2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array:");
        printArray(values);

        int[] swappedValues = reverseArray(values);

        System.out.println("\nReversed array:");
        printArray(swappedValues);
    }

    public static int[] reverseArray(int[] values) {
        int n = values.length;
        int[] swappedValues = new int[n];

        for (int i = 0; i < n; i++){
            swappedValues[i] = values[n - 1 - i];
        }

        return swappedValues;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
