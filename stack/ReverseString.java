import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        Stack<Character> s = new Stack<>();

        for(char c : str.toCharArray())
            s.push(c);

        while(!s.isEmpty())
            System.out.print(s.pop());
    }
}