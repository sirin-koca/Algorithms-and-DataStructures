package mix_oppgaver;

import java.util.ArrayList;
import java.util.Collections;

class Fruit implements Comparable<Fruit> {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Fruit{name='" + name + '\'' + '}';
    }
}

public class FruitsArrayListComparable {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Cherry"));
        Collections.sort(fruits);
        System.out.println(fruits);
        // Output: [Fruit{name='Apple'}, Fruit{name='Banana'}, Fruit{name='Cherry'}]
    }
}

/*
The Comparable interface in Java is a generic interface that typically looks like this:

public interface Comparable<T> {
    int compareTo(T o);
}

Here, T is a type parameter that represents the type of objects that this object can be compared with. The interface has a single method compareTo(T o) that you must implement when your class implements Comparable.

The compareTo method returns:

-1) - A negative integer if this object is less than the argument o
 0) - Zero if this object is equal to o
 1) - A positive integer if this object is greater than o

*/
