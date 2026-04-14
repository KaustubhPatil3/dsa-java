public class Recsearch
{
    public static Node head;
    public static Node tail;
    public static class Node
    {
        Node next;
        int data;
        public Node (int data)
        {
                this.data=data;
                this.next=null;
        }        
    }

    public static void addLast(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void printLL()
    {
        if(head==null)
        {
            System.out.print("Empty LL");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
             System.out.print(temp.data+" ");
            temp=temp.next;
        }
       System.out.println("null");
    }

    public static int rec_search(Node head, int key, int index)
{
    // Base case
    if(head == null)
    {
        return -1;
    }

    // Found
    if(head.data == key)
    {
        return index;
    }

    // Recursive call
    return rec_search(head.next, key, index + 1);
}
    public static void main(String args[])
    {
        addLast(60);
        addLast(20);
        addLast(30);
        addLast(10);
        printLL();
        int result = rec_search(head, 10, 0);

        if(result != -1)
        {
            System.out.println("Found at index: " + result);
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}