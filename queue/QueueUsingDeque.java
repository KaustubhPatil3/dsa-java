import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingDeque {

    static Deque<Integer> queue = new ArrayDeque<>();

    static void enqueue(int val) {
        queue.addLast(val);
    }

    static int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue.removeFirst();
    }

    static int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue.peekFirst();
    }

    static boolean isEmpty() {
        return queue.isEmpty();
    }

    static int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Front element: " + peek());
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Front element: " + peek());
        
        System.out.println("Queue size: " + size());
        System.out.println("Is empty: " + isEmpty());
    }
}