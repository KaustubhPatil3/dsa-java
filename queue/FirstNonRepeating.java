import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcdeeff";
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);

            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek());
            }
        }
    }
}