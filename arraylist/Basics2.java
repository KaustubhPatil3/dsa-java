import java.util.*;

public class Basics2 {
    public static void main(String args[]) {

        
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print full list
        System.out.println("ArrayList: " + list);

        // get() method
        System.out.println("Element at index 2: " + list.get(2));

        // contains() method
        System.out.println("Does 20 exist? " + list.contains(20));
        System.out.println("Does 100 exist? " + list.contains(100));

        // size() method
        System.out.println("Size of ArrayList: " + list.size());

        // Traversal
        System.out.println("All elements:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}