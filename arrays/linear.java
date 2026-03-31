import java.util.*;

public class linear 
{
    public static int line(int arr[],int num)
    {
        int n=num;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
               return i; 
            }
        }
        return -1;

    }

    public static void main(String args[])
    {
        int arr[]={2,5,3,8,7,1};
        int num=7;
        int i=line(arr,num);
        if(i==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Number found at="+i);
        }
    }
}
