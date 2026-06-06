public class SmallestString {
    
    public static String solve(int n, int k) {
        if (k > 9 * n) {
            return "-1";
        }
        
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = '0';
        }
        
        int rem = k;
        for (int i = n - 1; i >= 0 && rem > 0; i--) {
            int digit = Math.min(9, rem);
            result[i] = (char)('0' + digit);
            rem -= digit;
        }
        
        return new String(result);
    }
    
    public static void main(String[] args) {
        System.out.println(solve(5, 10));
        System.out.println(solve(3, 27));
        System.out.println(solve(4, 5));
    }
}