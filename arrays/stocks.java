import java.util.*;

public class stocks {
    public static int stock(int arr[])
    {
        int buy = Integer.MAX_VALUE;
        int sell=0;

        for(int i=0; i<arr.length;i++)
        {
            if (buy<arr[i])
            {
                int profit =arr[i]-buy;
                sell=Math.max(profit,sell);
            }
            else
            {
                buy= arr[i];
            }
        }
        return sell;
    }

    public static void main(String args[])
    {
        int arr[]={7,1,3,2,9};
        System.out.println("Selling Price with max profit="+stock(arr));
    }
    
}
