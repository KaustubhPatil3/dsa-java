import java.util.Scanner;

public class DuplicateParentheses {

    public static String duplicateParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (c == '(' || c == ')') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        System.out.println("Result: " + duplicateParentheses(input));
        sc.close();
    }
}