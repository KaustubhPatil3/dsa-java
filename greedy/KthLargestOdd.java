public class KthLargestOdd
{
    public static int kthOdd(int L, int R, int K) 
    {
        int count;

        if ((R & 1) == 1)
            count = (R - L) / 2 + 1;
        else
            count = (R - L + 1) / 2;

        if (K > count)
            return 0;

        return (R % 2 == 1) ? (R - 2 * (K - 1)) : (R - 2 * K + 1);
    }

    public static void main(String[] args)
    {
        int L = -3;
        int R = 3;
        int K = 1;

        System.out.println(kthOdd(L, R, K));
    }
}