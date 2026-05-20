import java.util.*;

public class DequeExample {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("After removals: " + deque);

        System.out.println("Size: " + deque.size());
        System.out.println("Is Empty: " + deque.isEmpty());
    }
}