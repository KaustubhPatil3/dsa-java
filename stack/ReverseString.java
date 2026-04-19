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
        String str2 = "Java Stack";
        System.out.println("Original : " + str2);
        System.out.println("Reversed : " + reverse(str2));

        System.out.println();
        String str3 = "12345";
        System.out.println("Original : " + str3);
        System.out.println("Reversed : " + reverse(str3));

        
        System.out.println("\n--- Edge Cases ---");
        System.out.println("Empty string  : \"" + reverse("") + "\"");
        System.out.println("Single char   : \"" + reverse("A") + "\"");
        System.out.println("Spaces        : \"" + reverse("a b c") + "\"");
        System.out.println("Special chars : \"" + reverse("h@e#l!l^o") + "\"");

        
        System.out.println("\n--- Palindrome Check ---");
        String[] tests = {"racecar", "hello", "Madam", "A man a plan a canal Panama", "12321", "12345"};
        for (String test : tests) {
            System.out.printf("%-35s -> %s%n", "\"" + test + "\"", isPalindrome(test) ? "Palindrome" : "Not a Palindrome ");
        }
    }
}