public class CircularQueue
{
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull()  { return size == capacity; }
    public int size()        { return size; }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        System.out.println(cq.enqueue(40));  // false - full
        System.out.println(cq.dequeue());    // 10
        cq.enqueue(40);
        
        while (!cq.isEmpty()) {
            System.out.println(cq.dequeue()); // 20 30 40
        }

        System.out.println(cq.dequeue());    // -1 - empty
    }
}