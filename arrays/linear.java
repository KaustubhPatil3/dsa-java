public class Linear
{
    public static int search(int arr[] , int n)
    {
    
        int pos= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                 pos =i;
            }
        }
        return pos;
    }
    public static void main(String s[])
    {
        int arr[]={1,4,2,8,5,9,3};
        int num =5;
        int i= search(arr,num);
        if(i==0)
        {
            System.out.println("Not Found");
        }
        else
            System.out.println("Found " +arr[i] +" at "+i+" position");
    }
}