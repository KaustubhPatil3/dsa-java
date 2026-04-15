public class Removecycle
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

   
    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }

        return false;
    }

   
    public static void removeCycle()
    {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }

        if(cycle == false)
        {
            return;
        }

      
        slow = head;
        Node prev = null;

        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        
        prev.next = null;
    }

    
    public static void printLL()
    {
        Node temp = head;
        int count = 0;

        while(temp != null && count < 20)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }

        System.out.println("null");
    }

    public static void main(String args[])
    {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        
        tail.next = head.next;

        System.out.println(isCycle());

        removeCycle();

        System.out.println(isCycle()); 

        printLL();
    }
}