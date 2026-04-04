abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}