import java.util.*;

public class StackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        return list.remove(list.size() - 1);
    }

    public static int peek() {
        return list.get(list.size() - 1);
    }
}