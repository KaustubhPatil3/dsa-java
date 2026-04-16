import java.util.*;
public class JFLL
{
    public static void main(String args[])    
    {
        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(1);
        l.addFirst(0);
        l.addLast(2);
        l.addLast(3);
        System.out.println(l);

        l.removeLast();
        System.out.println(l);
    }
}
