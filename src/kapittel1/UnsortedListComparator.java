package kapittel1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UnsortedListComparator {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(14);
        myList.add(11);
        myList.add(23);
        myList.add(4);

        // Sort myList alphabetically:
        myList.sort(Comparator.naturalOrder());

        // Print the sorted list
        System.out.println("Sorted list:");
        for(int list : myList){
            System.out.println(list);
        }
    }
}
