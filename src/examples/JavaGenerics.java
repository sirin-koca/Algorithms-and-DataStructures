package examples;

public class JavaGenerics {

    public static void main(String[] args) {

        // Intervall-sjekking med og uten ternary if
        for (int x = -10; x <= 10; x++) {
            System.out.println(x + " " + simpleIntervalCheck(x));
        }
        for (int x = -10; x <= 10; x++) {
            System.out.println(x + " " + ternaryIntervalCheck(x));
        }
        System.out.println();

        // Indeks til største element

        // En maks-funksjon for hver datatype
        int[] v = {2, 4, 10, 2, 3, 99, 4, 0};
        System.out.println(maksInt(v));
        char[] c = {'A', 'F', 'H', 'Z', 'L', 'P'};
        System.out.println(maksChar(c));
        System.out.println();

        // En generisk maks-funsksjon som støtter alle objekter som implementerer Comparable
        Integer[] v2 = {2, 4, 10, 2, 3, 99, 4, 0};
        System.out.println(maks(v2));
        Character[] c2 = {'A', 'F', 'H', 'Z', 'L', 'P'};
        System.out.println(maks(c2));
        String[] s = {"Algdat", "Er", "Kjempe", "Gøy", "!"};
        System.out.println(maks(s));
        System.out.println();

        // Klasse Pokemon som implementerer Comparable
        Pokemon[] pokemons = {
                new Pokemon("Blastoise", 10, 1000),
                new Pokemon("Pikachu", 8, 500),
                new Pokemon("Charmander", 7, 120),
                new Pokemon("Gengar", 10, 1001),
                new Pokemon("Jigglypuff", 10, 500),
                new Pokemon("Blastoise", 10, 1002)
        };
        // Test at toString funker som den skal
        System.out.println("Gotta catch 'em all!");
        for (Pokemon p : pokemons) {
            System.out.println(p);
        }
        // Test at den generiske maks-funksjonen funker for for Pokemon
        System.out.println(pokemons[maks(pokemons)] + " jeg velger deg!");

    }

    public static int simpleIntervalCheck(int x) {
        // Returner -1 hvis x < -5, 0 hvis -5 <= x <= 5, og 1 hvis x > 5
        int out = 0;
        if (x < -5) {
            out--;
        } else if (x > 5) {
            out++;
        }
        return out;
    }

    public static int ternaryIntervalCheck(int x) {
        // Samme som simpleIntervalCheck. Men denne koden er lite lesbar!
        return (x < -5) ? -1 : ((x > 5) ? 1 : 0);
    }

    public static int maksInt(int[] x) {
        // Returner indeks til største verdi for int[]
        int mi = 0;   // første index er null mi = 0
        int mv = x[mi]; // mv = x[0]
        for (int i = 1; i < x.length; i++) {
            if (x[i] > mv) {
                mi = i;
                mv = x[mi];
            }
        }
        return mi;
    }

    public static int maksChar(char[] c) {
        // Returner indeks til største verdi for char[]
        int mi = 0;
        char mv = c[mi];
        for (int i = 1; i < c.length; i++) {
            if (c[i] > mv) {
                mi = i;
                mv = c[mi];
            }
        }
        return mi;
    }

    public static <T extends Comparable<? super T>> int maks(T[] x) {
        // Returner indeks til største verdi for alle datatyper som er Comparable
        int mi = 0;
        T mv = x[mi];
        for (int i = 1; i < x.length; i++) {
            if (x[i].compareTo(mv) > 0) {
                mi = i;
                mv = x[mi];
            }
        }
        return mi;
    }

    public static class Pokemon implements Comparable<Pokemon> {
        // Klasse for Pokemons
        String name;
        Integer level;
        Integer hp;

        Pokemon(String name, int level, int hp) {
            // Konstruktor
            this.name = name;
            this.level = level;
            this.hp = hp;
        }

        public String toString() {
            // Denne funksjonen sørger for at System.out.print skriver
            // output som er lett å lese for mennesker
            return name + " (" + level + "," + hp + ")";
        }

        public int compareTo(Pokemon otherPokemon) {
            // Funksjon som definerer hvordan vi sammenligner to instanser av klassen
            // 1: Sammenlign level
            int out = this.level.compareTo(otherPokemon.level);
            if (out == 0) {
                // 2: Samme level - sammenlign hp
                out = this.hp.compareTo(otherPokemon.hp);
            }
            if (out == 0) {
                // 3: Samme hp og level - sammenlign navn
                out = this.name.compareTo(otherPokemon.name);
            }
            return out;
        }

    }

}

/*

Step-by-Step Explanation:

The class JavaGenerics is created.
Inside the main method, two for-loops demonstrate interval checking (one using a regular if-else and another using ternary operator).
Index of the maximum value from different types of arrays (int, char) is found using type-specific methods (maksInt and maksChar).
A generic method maks is demonstrated to find the maximum from any type of array that implements Comparable.
A custom class Pokemon is defined which implements the Comparable interface. It includes attributes like name, level, and hp.
An array of Pokemon objects is created, and the generic maks function is used to find the strongest Pokemon.
Interval Checking:

It's a method to categorize an input based on its range.
Example:
int x = 4;
if(x < 0) {
   System.out.println("Negative");
} else if(x > 0) {
   System.out.println("Positive");
} else {
   System.out.println("Zero");
}

Basic Concepts:

## Generics: Allow you to define a single class, method, or interface that can work with different types.
## Comparable: An interface for ordering objects of a class.
## Ternary Operator: A shorthand for if-else (condition ? ifTrue : ifFalse).

Main Parts:
Interval Checking Functions: simpleIntervalCheck and ternaryIntervalCheck.
Maximum Value Functions: maksInt, maksChar, and maks.
Pokemon Class: Defines a Pokemon object and how to compare them.
Concepts and Skills:

Java Basics: Loops, arrays, methods.
Generics: Understanding how to create and use generic methods and classes.
Object-Oriented Programming: Creating and using classes and objects.
Interfaces: Implementing and using the Comparable interface.
Ternary Operations: Using shorthand for if-else conditions.
 */