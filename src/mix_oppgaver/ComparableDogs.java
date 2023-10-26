package mix_oppgaver;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDogs {
    static class Dog implements Comparable<Dog> {
        String breed;
        int lifeExpectancy;

        public Dog(String breed, int lifeExpectancy) {
            this.breed = breed;
            this.lifeExpectancy = lifeExpectancy;
        }

        @Override
        public int compareTo(Dog other) {
            return Integer.compare(this.lifeExpectancy, other.lifeExpectancy);
        }

        @Override
        public String toString() {
            return this.breed + ", " + this.lifeExpectancy + " years";
        }
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pomchi", 15));
        dogs.add(new Dog("Pomeranian", 14));
        dogs.add(new Dog("JRT", 13));

        Collections.sort(dogs);

        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
}
