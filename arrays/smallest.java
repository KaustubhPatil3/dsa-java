import java.util.*;

public class smallest
{
    public static int chota(int num[])
    {
        int small = Integer.MAX_VALUE;
        for (int i=0;i<num.length;i++)
        {
            if(small>num[i])
            {
               small=num[i];
            }
        }
        return small;
    }
    public static void main(String args[])
    {
        int num[]={10,2,9,5,6,8};

        int l=chota(num);

        System.out.println("Smallest number ="+l);
    }
    
}
