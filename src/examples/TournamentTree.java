package examples;

public class TournamentTree {

    private static int[] a;
    private static int n;

    private static void propagateWinner(int id) {
        int left = 2 * id;
        int right = 2 * id + 1;

        // Ensure we don't go out of bounds
        if (left < n && right < n) {
            if (a[left] > a[right]) {
                a[id] = a[left];
            } else {
                a[id] = a[right];
            }
        }
    }

    public static void main(String[] args) {
        // Sample input array
        a = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  // Assuming index 0 is not used for easier child-parent calculations.
        n = a.length;

        // Update the tree using the logic provided
        for (int i = 5; i > 0; i--) {   // Starting from 5 based on your code
            propagateWinner(i);
        }

        // Print the updated tree
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
