import java.util.*;

public class reverse 
{
    public static void rev(int a[])
    {
        int start=0 , end=a.length-1;
        while(start<end)
        {
               int t =a[start] ;
                a[start]=a[end];
                a[end]=t;

                start++;
                end--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String args[])    
    {
        int arr[]={10,20,70,40,50};
        rev(arr);
    }
}
