public class NthNode
{
    public static Node head;
    public static Node tail;

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

    
    public static void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

   
    public static void printLL()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    
    public static int findNthFromEnd(int n)
    {
        int size = 0;
        Node temp = head;

        
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }

        
        temp = head;
        for(int i = 1; i <= size - n; i++)
        {
            temp = temp.next;
        }

        return temp.data;
    }

    
    public static void removeNthFromEnd(int n)
    {
        int size = 0;
        Node temp = head;

        
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }

       
        if(n == size)
        {
            head = head.next;
            return;
        }

        
        Node prev = head;
        for(int i = 1; i < size - n; i++)
        {
            prev = prev.next;
        }

      
        prev.next = prev.next.next;
    }

    public static void main(String args[])
    {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        System.out.println("Original LL:");
        printLL();

        
        int val = findNthFromEnd(2);
        System.out.println("2nd from end: " + val);

       
        removeNthFromEnd(2);
        System.out.println("After removing 2nd from end:");
        printLL();
    }
}