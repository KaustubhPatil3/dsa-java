public class QueueArray {

    static String[] queue = new String[5];
    static int front = 0, rear = 0;

    static void enqueue(String value) {
        if (rear == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = value;
        System.out.println(value + " added");
    }

    static void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[front++] + " removed");
    }

    static void peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + queue[front]);
    }

    static void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue("Alice");
        enqueue("Bob");
        enqueue("Charlie");
        enqueue("Diana");

        display();
        peek();

        dequeue();
        dequeue();

        display();
    }
}