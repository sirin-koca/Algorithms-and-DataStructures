package uke46_eksamensgjennomgang;

public class Cat extends Animals{
    String name;
    int age;
    public Cat(){
        this.age=age;
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println("nom nom");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meoow!");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat(); // calling eat method from Animals-class
        myCat.makeNoise();
    }
}
