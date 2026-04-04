public class X^n {

    public static int power(int x, int n) {
        if (n == 0)   // base case
            return 1;

        return x * power(x, n - 1); // recursive call
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println("Result = " + power(x, n));
    }
}