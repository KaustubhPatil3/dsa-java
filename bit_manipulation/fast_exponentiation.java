public class fast_exponentiation {
    public static int power(int a, int n) {
        int result = 1;

        while(n > 0) {
            if((n & 1) != 0) {
                result = result * a;
            }
            a = a * a;
            n = n >> 1;
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(power(2, 10));
    }
}