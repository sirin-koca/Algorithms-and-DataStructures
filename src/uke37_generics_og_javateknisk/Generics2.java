package uke37_generics_og_javateknisk;

            // Geeric methods
public class Generics2 {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C'};
        String[] stringArray = {"Hello", "Sirin", "how", "are you today?"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

    }

    public static <Type> void displayArray(Type[] array){
        for (Type x: array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array){
        return array[0];
    }
}
