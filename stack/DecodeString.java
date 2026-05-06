import java.util.Stack;

public class DecodeString {

    static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) 
        {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); 

            } else if (ch == '[') {
                countStack.push(k);         
                strStack.push(current);    
                current = new StringBuilder();
                k = 0;

            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decoded = strStack.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(current);  
                }
                current = decoded;

            } else {
                current.append(ch);  
            }
        }

        return current.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(decode("3[a]2[bc]"));       
        System.out.println(decode("2[abc]3[cd]ef"));   
        System.out.println(decode("3[a2[bc]]"));      
    }
}