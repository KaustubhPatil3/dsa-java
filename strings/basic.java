
public class basic {
    public static void main(String args[]) {
        
        String str = "Hello World";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring()
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));

        // 4. equals()
        String str2 = "Hello World";
        System.out.println("Equals: " + str.equals(str2));

        // 5. compareTo()
        System.out.println("Compare: " + str.compareTo(str2));

        // 6. toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 7. contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // 8. replace()
        System.out.println("Replace: " + str.replace("World", "Java"));

        // 9. trim()
        String str3 = "   Hello   ";
        System.out.println("Trim: '" + str3.trim() + "'");

        // 10. indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));
    }
}