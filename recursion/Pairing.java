public class Pairing {

    public static int friendsPair(int n) {
        if (n == 1 || n == 2)   // base case
            return n;

        return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways = " + friendsPair(n));
    }
}