package uke37_generics_og_javateknisk;

    // Generic classes
class MyGenericClass<Thing> {

    Thing x;

    MyGenericClass(Thing x) { // constructor
        this.x = x;
    }

    public Thing getValue() {
        return x;
    }
}

public class Generics3 {
    public static void main(String[] args) {
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(1.1);
        MyGenericClass<String> myString = new MyGenericClass<>("Pawsome");
        MyGenericClass<Character> myChar = new MyGenericClass<>('A');

        System.out.println(
                        myInt.getValue() + ", " +
                        myDouble.getValue() + ", " +
                        myString.getValue() + ", " +
                        myChar.getValue());
    }
}
