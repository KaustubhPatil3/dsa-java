public class StackIntro
{
    static int stack[] = new int[5];
    static int top = -1;

    public static boolean isEmpty() 
    {
        return top == -1;
    }

 
    public static boolean isFull() 
    {
        return top == stack.length - 1;
    }

    public static void push(int data)
    {
        if (isFull()) {
            System.out.println("Overflow - Cannot push " + data);
            return;
        }
        stack[++top] = data;
        System.out.println("Pushed: " + data);
    }

    public static int pop()
    {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        int popped = stack[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }

    public static int peek() 
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Top element: " + stack[top]);
        return stack[top];
    }

    
    public static void display()  
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
            if (i != 0) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        // Push elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60); 

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
        pop(); 
    }
}