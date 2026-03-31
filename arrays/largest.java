import java.util.*;

public class largest
{
    public static int big(int num[])
    {
        int large = Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++)
        {
            if(large<num[i])
            {
               large=num[i];
            }
        }
        return large;
    }
    public static void main(String args[])
    {
        int num[]={1,2,9,5,6,8};

        int l=big(num);

        System.out.println("Largest number ="+l);
    }
    
}
