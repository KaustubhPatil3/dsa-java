public class Sumsubarrays
{
    public static void sumsub(int arr[])
    {
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;  
        
    for(int i=0;i<arr.length;i++)
    {
         for(int j=i;j<arr.length;j++)
        {

            int sum = 0;

            for(int k=i;k<=j;k++)
             {
                sum += arr[k];
             }

        max = Math.max(max,sum);
        min = Math.min(min,sum);
        }
    }
    
    System.out.println("Minimum sum: "+min);
    System.out.println("Maximum sum: "+max);
    }
        

    public static void main(String s[])
    {
        int arr[]={1,2,3};
        sumsub(arr);
    }
}