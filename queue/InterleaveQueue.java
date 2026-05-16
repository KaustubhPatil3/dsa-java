import java.util.*;

public class InterleaveQueue 
{
    public static void interLeave(Queue<Integer> q) 
    {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        // Add first half elements into firstHalf queue
        for (int i = 0; i < size / 2; i++) 
        {
            firstHalf.add(q.remove());
        }

        // Interleave both halves
        while (!firstHalf.isEmpty()) 
        {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
      

        System.out.println("Original Queue : " + q);

        interLeave(q);

        System.out.println("Interleaved Queue : " + q);
    }
}