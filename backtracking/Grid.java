public class Grid 
{
    public static int ways(int i, int j, int n, int m)
    {
        // base case (destination)
        if(i == n-1 && j == m-1)
            return 1;

        // out of bounds
        if(i >= n || j >= m)
            return 0;

        // move right
        int right = ways(i, j+1, n, m);

        // move down
        int down = ways(i+1, j, n, m);

        return right + down;
    }

    public static void main(String args[])
    {
        int n = 3, m = 3;
        System.out.println(ways(0, 0, n, m));
    }
}