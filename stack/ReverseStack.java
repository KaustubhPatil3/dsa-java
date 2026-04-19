import java.util.*;

public class ReverseStack {

    
    static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();       
        pushBottom(s, data);    
        s.push(top);            
    }

    
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();       
        reverse(s);             
        pushBottom(s, top);      
    }

    
    static void display(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack (top -> bottom): " + s.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", " ->")
                .trim()
                + " (top: " + s.peek() + ")");
    }

    public static void main(String[] args) {

       
        System.out.println("--- Basic Reverse ---");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1); s1.push(2); s1.push(3); s1.push(4); s1.push(5);
        System.out.print("Before: "); display(s1);
        reverse(s1);
        System.out.print("After : "); display(s1);

        
        System.out.println("\n--- Single Element ---");
        Stack<Integer> s2 = new Stack<>();
        s2.push(42);
        System.out.print("Before: "); display(s2);
        reverse(s2);
        System.out.print("After : "); display(s2);

       
        System.out.println("\n--- Two Elements ---");
        Stack<Integer> s3 = new Stack<>();
        s3.push(10); s3.push(20);
        System.out.print("Before: "); display(s3);
        reverse(s3);
        System.out.print("After : "); display(s3);

       
        System.out.println("\n--- Empty Stack ---");
        Stack<Integer> s4 = new Stack<>();
        System.out.print("Before: "); display(s4);
        reverse(s4);
        System.out.print("After : "); display(s4);

      
        System.out.println("\n--- Reverse Twice ---");
        Stack<Integer> s5 = new Stack<>();
        s5.push(10); s5.push(20); s5.push(30);
        System.out.print("Original : "); display(s5);
        reverse(s5);
        System.out.print("Reversed : "); display(s5);
        reverse(s5);
        System.out.print("Restored : "); display(s5);
    }
}