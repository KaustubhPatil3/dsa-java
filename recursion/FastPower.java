public class FastPower 
{
    public static int power(int x, int n)
    {
        if (n == 0) return 1;

        int half = power(x, n / 2);
        int halfSq = half * half;

        if (n % 2 != 0)
            return x * halfSq;

        return halfSq;
    }

    public static void main(String[] args) 
    {
        System.out.println(power(2, 5));
    }
}