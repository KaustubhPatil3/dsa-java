import java.util.*;

public class ReverseString {

   
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Stack<Character> s = new Stack<>();

        for (char c : str.toCharArray())
            s.push(c);

        
        StringBuilder reversed = new StringBuilder();
        while (!s.isEmpty())
            reversed.append(s.pop());

        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedStr = reverse(cleaned);
        return cleaned.equals(reversedStr);
    }

    public static void main(String[] args)
    {

        System.out.println("--- Reverse Strings ---");
        String str = "hello";
        System.out.println("Original : " + str);
        System.out.println("Reversed : " + reverse(str));

       
        System.out.println();
        String str3 = "12345";
        System.out.println("Original : " + str3);
        System.out.println("Reversed : " + reverse(str3));        

    }
}