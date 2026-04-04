class Demo {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.add(2,3));
        System.out.println(d.add(2,3,4));
    }
}