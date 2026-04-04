class Demo {
    public int a = 10;
    private int b = 20;
    protected int c = 30;

    void show() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class Access {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}