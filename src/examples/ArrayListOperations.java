package examples;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        // 1. Initialization
        ArrayList<Integer> myArrList = new ArrayList<>();

        // 2. Adding Elements
        myArrList.add(5);   // No need to specify index if adding to the end
        myArrList.add(10);
        myArrList.add(15);
        myArrList.add(20);
        myArrList.add(25);

        // 3. Modification
        int currentValue = myArrList.get(2); // Get the third element
        myArrList.set(2, currentValue * 2);  // Double its value and set it

        // 4. Access
        System.out.println(myArrList.get(0));

        // 5. Contains Check
        boolean contains = myArrList.contains(50);
        if(contains){
            System.out.println("50 is in the list");
        } else {
            System.out.println("50 is not in the list");
        }

        // 6. Insertion
        myArrList.add(1, 100); // The index for the second position, it should be 1.

        // 7. Deletion
        myArrList.remove(myArrList.size() - 1); // Removes the last element

        // 8. Iteration
        for(Integer val : myArrList){
            System.out.print(val + " ");
        }
        System.out.println(); // For a newline

        // 9. Size Check
        int size = myArrList.size();
        System.out.println("Size of the ArrayList: " + size);

        // 10. Clear
        myArrList.clear();

        // 11. Empty Check
        boolean isEmpty = myArrList.isEmpty();
        if(isEmpty) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }
}
