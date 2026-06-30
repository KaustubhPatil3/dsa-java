public class simple
{
    public static void update(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String s[])
    {
        int arr[]={11,2,3,4};
        update(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }   
}

