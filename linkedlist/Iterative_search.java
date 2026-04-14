public class Iterative_search
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

    public static int iterate_search(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
              return i;
            }
          temp=temp.next;
          i++;

        }
        return -1;
    }
    public static void main(String args[])
    {
        addLast(60);
        addLast(20);
        addLast(30);
        addLast(10);
        printLL();
        int result =iterate_search(10);
        if(result!=-1)
        {
            System.out.print("Found 10 at "+(result+1));
        }
        else
            System.out.println("Not Found");
    }
}