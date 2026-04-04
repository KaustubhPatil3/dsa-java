class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}

public class Static {
    public static void main(String[] args) {
        new Demo();
        new Demo();
        System.out.println(Demo.count);
    }
}