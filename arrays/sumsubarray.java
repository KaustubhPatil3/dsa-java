import java.util.*;

public class sumsubarray
{
    public static void sub(int arr[])
    {
        int sum;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;  

        for(int i=0;i<arr.length;i++)
        {
            int start=i; 
            for(int j=i;j<arr.length;j++)
            {
                sum=0;
                int end =j;
                for(int k=start;k<=end;k++)
                {
                  sum+=arr[k];
                }
                if(sum<min)
                {
                    min=sum;
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }      
        System.out.println("Minimum sum: "+min);
        System.out.println("Maximum sum: "+max);
    }
    public static void main(String args[])    
    {
        int num[]={2,3,4,5,6};

        sub(num);
    }
}
