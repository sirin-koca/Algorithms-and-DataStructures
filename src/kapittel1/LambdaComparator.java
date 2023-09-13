package kapittel1;

import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;
public class LambdaComparator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Grape");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // Sort the list of fruits alphabetically
        // Lambda expression:
        fruits.sort((f1, f2) -> f1.compareTo(f2)); // fruits.sort(Comparator.naturalOrder());

        // Print the sorted list of fruits
        System.out.println("Sorted list of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}