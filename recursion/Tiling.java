public class Tiling 
{
    public static int ways(int n) 
    {
      
        if (n == 0 || n == 1)
        {
            return 1;
        }

        
        int vertical = ways(n - 1);

        
        int horizontal = ways(n - 2);

        return vertical + horizontal;
    }

    public static void main(String args[])
    {
        int n = 5;
        System.out.println(ways(n)); 
    }
}