class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}