import java.util.*;

public class Swap {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before swap: " + list);

        // swap index 1 and 3
        Collections.swap(list, 1, 3);

        System.out.println("After swap: " + list);
    }
}