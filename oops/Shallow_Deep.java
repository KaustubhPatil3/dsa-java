class Demo implements Cloneable {
    int x;

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class Shallow_Deep {
    public static void main(String[] args) throws Exception {
        Demo d1 = new Demo();
        d1.x = 5;

        Demo d2 = (Demo) d1.clone();
        System.out.println(d2.x);
    }
}