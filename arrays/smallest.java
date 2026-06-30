public class Smallest
{
    public static int chota (int arr[])
    {
        int s=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<s)
                s=arr[i];
        }
        return s;
    }

    public static void main(String s[])
    {
        int arr[]={1,3,4,7,2,9};
        int k=chota(arr);
        System.out.println(k);
    }
}