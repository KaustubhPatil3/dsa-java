public class StackLL {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }

    static Node head;

    public static void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static int pop(){
        int val = head.data;
        head = head.next;
        return val;
    }
}