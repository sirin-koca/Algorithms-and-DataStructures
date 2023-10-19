package examples;

public class ReverseArray1 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        int n = values.length;

        int[] swappedValues = new int[n];

        int j = 0;
        for(int i = n-1; i >= 0; i--){
            swappedValues[i] = values[i];
            j++;
        }

        // Print the original array
        for (int vals : values){
            System.out.print(vals + " ");
        }
        System.out.println(" ");

        // Print the reversed array
        for (int vals : swappedValues) {
            System.out.print(vals + " ");
        }
    }
}
