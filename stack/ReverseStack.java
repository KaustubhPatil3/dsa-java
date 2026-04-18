import java.util.*;

public class ReverseStack {
    static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s,data);
        s.push(top);
    }

    static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushBottom(s, top);
    }
}