public class Largest 
{
    public static int large(int arr[])
    {
        int l = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
                l=arr[i];
        }
        return l;
    }   
    public static void main(String s[])
    {
        int arr[]={1,2,64,6,20};
        int l=large(arr);

        System.out.println(l);

    }
}
