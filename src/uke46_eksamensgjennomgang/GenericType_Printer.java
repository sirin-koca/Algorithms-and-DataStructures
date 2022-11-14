package uke46_eksamensgjennomgang;

import java.util.ArrayList;

public class GenericType_Printer <T>{
    /*
    Integer thingToPrint;
    public GenericType_Printer(){
        this.thingToPrint = thingToPrint;
    }
    public void print(Integer thingToPrint){
        System.out.println(thingToPrint);
    }
    public static void main(String[] args) {
        GenericType_Printer printer = new GenericType_Printer();
        printer.print(100);
    }
    */

    T thingToPrint;

    public GenericType_Printer(){
        this.thingToPrint = thingToPrint;
    }

    public void print(T thingToPrint){
        System.out.println(thingToPrint);
    }

    public static void main(String[] args) {
        GenericType_Printer<Integer> integerPrinter = new GenericType_Printer<>();
        GenericType_Printer<String> stringPrinter = new GenericType_Printer<>();
        GenericType_Printer<Double> doublePrinter = new GenericType_Printer<>();

        integerPrinter.print(23);
        stringPrinter.print("Hello");
        doublePrinter.print(33.33);

        ArrayList<Animals> myAnimals = new ArrayList<>();
        myAnimals.add(new Cat());
        myAnimals.add(new Dog());
        new Cat().makeNoise();
        new Cat().eat();
        new Dog().makeNoise();
        new Dog().eat();

        System.out.println("How many animals do I have? : " + myAnimals.size());
    }
}
