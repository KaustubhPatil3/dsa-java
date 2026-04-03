public class stringBuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("Append: " + sb);

        // 2. length()
        System.out.println("Length: " + sb.length());

        // 3. charAt()
        System.out.println("Char at 1: " + sb.charAt(1));

        // 4. setCharAt()
        sb.setCharAt(0, 'Y');
        System.out.println("After setCharAt: " + sb);

        // 5. insert()
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        // 6. delete()
        sb.delete(5, 10);
        System.out.println("Delete: " + sb);

        // 7. reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}