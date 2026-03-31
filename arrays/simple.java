//Pass by reference
import java.util.*;

public class simple
{
     public static void update(int arr[])
        {
            
            for(int i=0;i<arr.length;i++)
            {
                 arr[i] = arr[i]+1;
            }
        }
    public static void main(String args[])
        {
    
        int arr[]={10,20,29};
        update(arr);
        System.out.println("Array Values :");

            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
}