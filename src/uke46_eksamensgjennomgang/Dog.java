package uke46_eksamensgjennomgang;

public class Dog extends Animals {
    String name;
    int age;
    public Dog(){
        this.name=name;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println("Chom chom");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woff Woff!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.makeNoise();
    }
}
