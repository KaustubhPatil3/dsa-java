public class DoubleLL 
{
    public static class Node 
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

   
    public static void addFirst(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    
    public static void addLast(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }


    public static void removeFirst()
    {
        if (head == null)
        {
            System.out.println("Empty");
            return;
        }

        if (head.next == null)
        {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    
    public static void removeLast()
    {
        if (tail == null)
        {
            System.out.println("Empty");
            return;
        }

        if (head == tail)
        {
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    
    public static void printForward()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   
    public static void printReverse()
    {
        Node temp = tail;

        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

   
    public static void main(String args[])
    {
        addFirst(1);
        addFirst(2);
        addLast(3);
        addLast(4);

        System.out.println("Forward:");
        printForward();

        System.out.println("Reverse:");
        printReverse();

        System.out.println("Size = " + size);

        removeFirst();
        removeLast();

        System.out.println("After deletion:");
        printForward();
        System.out.println("Size = " + size);
    }
}