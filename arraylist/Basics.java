import java.util.*;

public class Basics {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(1, 15);
        System.out.println(list);

        list.set(2, 100);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println("Size: " + list.size());

        for(int val : list) {
            System.out.println(val);
        }
    }
}