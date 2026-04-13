public class Simple
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return; // IMPORTANT FIX
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add at middle (index)
    public void addMid(int ind, int data)
    {
        if (ind == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < ind - 1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first node
    public static int removeFirst()
    {
        if (size == 0)
        {
            System.out.println("LL is Empty");
            return 0;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    // Remove last node
    public int removeLast()
    {
        if (size == 0)
        {
            System.out.println("LL is Empty");
            return 0;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++)
        {
            prev = prev.next;
        }

        int val = prev.next.data; // last node
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // Print Linked List
    public void printLL()
    {
        if (head == null)
        {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String args[])
    {
        Simple s = new Simple();

        s.printLL();

        s.addFirst(2);
        s.printLL();

        s.addFirst(1);
        s.printLL();

        s.addLast(4);
        s.printLL();

        s.addLast(5);
        s.printLL();

        s.addMid(2, 3);
        s.printLL();

        System.out.println("Size = " + size);

        System.out.println("Deleted Head = " + removeFirst());
        s.printLL();

        System.out.println("Deleted Tail = " + s.removeLast());
        s.printLL();

        System.out.println("Final Size = " + size);
    }
}