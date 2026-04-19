import java.util.*;

public class PushBottom {

    
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();       
        pushBottom(s, data);     
        s.push(top);             
    }

    public static void display(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Stack<Integer> temp = new Stack<>();
        temp.addAll(s);
        System.out.print("Stack (top -> bottom): ");
        while (!temp.isEmpty()) {
            System.out.print(temp.pop());
            if (!temp.isEmpty()) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        
        System.out.println("--- Basic pushBottom ---");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1); s1.push(2); s1.push(3);
        System.out.print("Before: "); display(s1);
        pushBottom(s1, 99);
        System.out.print("After pushBottom(99): "); display(s1);

        
        System.out.println("\n--- Single Element ---");
        Stack<Integer> s2 = new Stack<>();
        s2.push(10);
        System.out.print("Before: "); display(s2);
        pushBottom(s2, 55);
        System.out.print("After pushBottom(55): "); display(s2);

        
        System.out.println("\n--- Empty Stack ---");
        Stack<Integer> s3 = new Stack<>();
        System.out.print("Before: "); display(s3);
        pushBottom(s3, 77);
        System.out.print("After pushBottom(77): "); display(s3);

       
        System.out.println("\n--- Multiple pushBottoms ---");
        Stack<Integer> s4 = new Stack<>();
        s4.push(10); s4.push(20); s4.push(30);
        System.out.print("Initial : "); display(s4);
        pushBottom(s4, 5);
        System.out.print("pushBottom(5)  : "); display(s4);
        pushBottom(s4, 2);
        System.out.print("pushBottom(2)  : "); display(s4);
        pushBottom(s4, 1);
        System.out.print("pushBottom(1)  : "); display(s4);

        
        System.out.println("\n--- Build Stack Bottom-Up ---");
        Stack<Integer> s5 = new Stack<>();
        int[] values = {10, 20, 30, 40, 50};
        for (int v : values) {
            pushBottom(s5, v);
            System.out.print("pushBottom(" + v + "): "); display(s5);
        }
    }
}