import java.util.*;

public class Maximum {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(90);
        list.add(20);

        System.out.println("ArrayList: " + list);

        int max = Collections.max(list);

        System.out.println("Maximum element: " + max);
    }
}