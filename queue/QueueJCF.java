import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF
{

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("Size: " + queue.size());

        System.out.println("Empty: " + queue.isEmpty());
    }
}
