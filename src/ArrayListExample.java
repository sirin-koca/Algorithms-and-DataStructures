import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        // The ArrayList class is a resizable array, which can be found in the java.util package.

        // String
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("This is an array of cars: " + cars);

        cars.size();   // array length
        cars.get(0);  // access an element
        cars.set(0, "Opel");   // modify an element
        System.out.println("Change the first element: " + cars);

        System.out.print("Sort cars-array: ");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.print(i + ", ");
        }
        System.out.println();  // empty print - break


        cars.remove(0);  // remove an element
        System.out.println("Remove index[0]: " + cars);

        cars.clear();   // clear all
        System.out.println("Clear all: " + cars);

        // Integer
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(40);
        myNumbers.add(15);
        myNumbers.add(10);
        myNumbers.add(25);
        myNumbers.add(5);
        myNumbers.add(20);

        System.out.print("My numbers: ");
        for (int i : myNumbers) {
            System.out.print(i + ", ");
        }
        myNumbers.add(30);
        System.out.print(myNumbers.get(4));

        System.out.println();
        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}