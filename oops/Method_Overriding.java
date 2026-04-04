class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}