public class Circular
{

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

   
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;   
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;  
    }

    
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;  
    }

   
    public void printList()
    {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

   
    public void removeFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;   
    }

    
    public void removeLast() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    
    public static void main(String[] args) {
        Circular list = new Circular();

        list.addFirst(3);
        list.addFirst(1);
        list.addLast(5);
        list.addLast(7);

        list.printList();   

        list.removeFirst();
        list.printList();   

        list.removeLast();
        list.printList();   
    }
}