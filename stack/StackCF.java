import java.util.*;

public class StackCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        
        System.out.println("--- Pushing Elements ---");
        s.push(10);
        System.out.println("Pushed: 10");
        s.push(20);
        System.out.println("Pushed: 20");
        s.push(30);
        System.out.println("Pushed: 30");
        s.push(40);
        System.out.println("Pushed: 40");
        s.push(50);
        System.out.println("Pushed: 50");

        System.out.println("\nStack (bottom -> top): " + s);

        System.out.println("\n--- Peek ---");
        System.out.println("Top element: " + s.peek());

        
        System.out.println("\n--- Search ---");
        System.out.println("Position of 30 from top: " + s.search(30)); 
        System.out.println("Position of 99 from top: " + s.search(99)); 

       
        System.out.println("\n--- isEmpty ---");
        System.out.println("Is stack empty? " + s.isEmpty());

        
        
     
    }
}