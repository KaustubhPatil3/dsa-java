class A {
    void showA() {
        System.out.println("A");
    }
}

class B extends A {
    void showB() {
        System.out.println("B");
    }
}

class C extends A {
    void showC() {
        System.out.println("C");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.showA();
        b.showB();

        c.showA();
        c.showC();
    }
}