public class rainwater
{
    public static int trapped(int arr[])
    {
        int n=arr.length;
        
        int left[]=new int[n];
        left[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int water=0;
        for(int i=0;i<n;i++)
        {
            int level=Math.min(right[i],left[i]);
            water+=level-arr[i];
        }
        return(water);
    }
    public static void main(String args[])
    {
       int arr[] ={7,2,5,3,8};
       System.out.println("Water trapped ="+trapped(arr));
       
    }
    
}