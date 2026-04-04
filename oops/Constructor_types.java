class Demo {
    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized: " + x);
    }
}

public class Constructor_types {
    public static void main(String[] args) {
        new Demo();
        new Demo(10);
    }
}