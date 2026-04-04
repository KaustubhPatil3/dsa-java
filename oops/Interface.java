interface A {
    void show();
}

class Demo implements A {
    public void show() {
        System.out.println("Interface method");
    }
}

public class Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}