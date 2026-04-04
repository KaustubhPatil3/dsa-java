public class Factorial {

    public static int fact(int n) {
        if (n == 0 || n == 1)  // base case
            return 1;

        return n * fact(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial = " + fact(n));
    }
}