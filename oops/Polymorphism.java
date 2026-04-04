class Demo {
    void show() {
        System.out.println("Polymorphism");
    }
}

class Test extends Demo {
    void show() {
        System.out.println("Overridden Method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Demo d = new Test();
        d.show();
    }
}