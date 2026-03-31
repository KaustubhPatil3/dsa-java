import java.util.*;

public class prefixsum
{
    public static void sub(int arr[])
    {
        int n = arr.length;

        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        int max = Integer.MIN_VALUE;
       
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int sum;

                if(i == 0)
                {
                    sum = prefix[j];
                }
                else
                {
                    sum = prefix[j] - prefix[i-1];
                }

               

              
                if(sum > max)
                {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum: " + max);  
    }

    public static void main(String args[])    
    {
        int num[] = {2, 3, 4, 5, 6};
        sub(num);
    }
}