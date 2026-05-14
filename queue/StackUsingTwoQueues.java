import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());  // 3
        System.out.println(stack.pop());  // 3
        System.out.println(stack.top());  // 2
        System.out.println(stack.isEmpty()); // false
    }
}