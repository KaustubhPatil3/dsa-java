public class ReverseLL
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
        if(head == null)
        {
            System.out.println("Empty LL");
            return;
        }

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // (Iterative)
    public static void reverseLL()
    {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;   
            prev = curr;      
            curr = next;       
        }

        head = prev;
    }

    // Reverse LL (Recursive)
    public static Node reverseRec(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node newHead = reverseRec(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String args[])
    {
        addLast(60);
        addLast(20);
        addLast(30);
        addLast(10);

        System.out.println("Original LL:");
        printLL();

        
        reverseLL();
        System.out.println("After Iterative Reverse:");
        printLL();

        
        head = reverseRec(head);
        System.out.println("After Recursive Reverse:");
        printLL();
    }
}