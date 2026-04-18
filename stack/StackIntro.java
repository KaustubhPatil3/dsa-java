public class StackIntro {
    static int stack[] = new int[5];
    static int top = -1;

    public static void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Overflow");
            return;
        }
        stack[++top] = data;
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];
    }

    public static int peek() {
        return stack[top];
    }

    public static void main(String[] args) {
        push(10); push(20);
        System.out.println(pop());
    }
}