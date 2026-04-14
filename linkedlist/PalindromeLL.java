public class PalindromeLL
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

    
    public static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
    public static boolean isPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }

       
        Node mid = findMid(head);

        
        Node prev = null;
        Node curr = mid;

        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;   
        Node left = head;

        
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[])
    {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(2);
        addLast(1);

        printLL();

        if(isPalindrome())
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}