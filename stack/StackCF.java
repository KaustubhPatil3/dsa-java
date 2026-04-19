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

        
        System.out.println("\n--- Popping Elements ---");
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Stack after 2 pops: " + s);

        
        System.out.println("\n--- Popping All Remaining ---");
        while (!s.isEmpty()) {
            System.out.println("Popped: " + s.pop());
        }

        
        System.out.println("\n--- Pop on Empty Stack ---");
        try {
            s.pop();
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: EmptyStackException - Stack is empty");
        }
    }
}