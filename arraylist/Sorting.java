import java.util.*;

public class Sorting {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Before sorting: " + list);

        // Sorting (Ascending)
        Collections.sort(list);

        System.out.println("After sorting (Ascending): " + list);


        // Descending
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("After sorting (Descending): " + list);
    }
}