import java.util.*;

public class StackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

   
    public static boolean isEmpty() {
        return list.isEmpty();
    }

    public static void push(int data) {
        list.add(data);
        System.out.println("Pushed: " + data);
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        int popped = list.remove(list.size() - 1);
        System.out.println("Popped: " + popped);
        return popped;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Top element: " + list.get(list.size() - 1));
        return list.get(list.size() - 1);
    }

    
    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Push elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.println();
        display();

        System.out.println();
        peek();

        System.out.println();
       
        pop();
        pop();
        display();

        System.out.println();
      
        pop(); pop(); pop();
        pop(); // Should trigger underflow
    }
}