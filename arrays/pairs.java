public class Pairs 
{
    public static void pair(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String s[])
    {
        int arr[]={1,2,3,4,5};
        pair(arr);
    }
}