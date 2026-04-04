class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }

    Demo(Demo d) {
        this.x = d.x;
    }
}

public class Copy {
    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(d1);
        System.out.println(d2.x);
    }
}