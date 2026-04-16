public class MergeSort
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

    // Add at last
    public static void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Find Mid
    public static Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public static Node merge(Node left, Node right)
    {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(left != null && right != null)
        {
            if(left.data < right.data)
            {
                temp.next = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null)
        {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null)
        {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    // Merge Sort
    public static Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // Split
        Node rightHead = mid.next;
        mid.next = null;

        // Recursion
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // Merge
        return merge(left, right);
    }

    // Print list
    public static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        addLast(5);
        addLast(3);
        addLast(8);
        addLast(2);
        addLast(1);

        System.out.print("Original: ");
        print(head);

        head = mergeSort(head);

        System.out.print("Sorted: ");
        print(head);
    }
}