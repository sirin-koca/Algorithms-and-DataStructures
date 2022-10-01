
class Printer<T> {
    T myPrint;

    public Printer(T myPrint) {
        this.myPrint = myPrint;
    }

    public void print(T myPrint) {
        System.out.println(myPrint);
    }
}

public class Generics {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        Printer<Double> doublePrinter = new Printer<>(1.1);
        Printer<String> stringPrinter = new Printer<>("Hello Generics");

        integerPrinter.print(1);
        doublePrinter.print(1.1);
        stringPrinter.print("Java Generics");

    }
}
