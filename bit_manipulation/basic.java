public class basic {
    public static void main(String args[]) {
        
        int a = 5;   // 0101
        int b = 3;   // 0011

        // AND (&)
        System.out.println("a & b = " + (a & b));   // 0001 = 1

        // OR (|)
        System.out.println("a | b = " + (a | b));   // 0111 = 7

        // XOR (^)
        System.out.println("a ^ b = " + (a ^ b));   // 0110 = 6

        // NOT (~)
        System.out.println("~a = " + (~a));         // -(a+1)

        // Left Shift (<<)
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10

        // Right Shift (>>)
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 = 2
    }
}