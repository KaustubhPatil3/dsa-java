public class StackLL {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node head = null;

    
    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Pushed: " + data);
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        System.out.println("Popped: " + val);
        return val;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Top element: " + head.data);
        return head.data;
    }

    
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Push elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.println();
        display();

        System.out.println();
        peek();

        System.out.println();
       
        pop();
        pop();
        display();

        System.out.println();
        
        
    }
}