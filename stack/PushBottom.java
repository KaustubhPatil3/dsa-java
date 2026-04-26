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

    public static void main(String[] args)
    {
        
        System.out.println("--- Basic pushBottom ---");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1); s1.push(2); s1.push(3);
        System.out.print("Before: "); display(s1);
        pushBottom(s1, 99);
        System.out.print("After pushBottom(99): "); display(s1);

               
        System.out.println("\n--- Empty Stack ---");
        Stack<Integer> s3 = new Stack<>();
        System.out.print("Before: "); display(s3);
        pushBottom(s3, 77);
        System.out.print("After pushBottom(77): "); display(s3);
   
    }
}