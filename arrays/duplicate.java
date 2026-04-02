public class duplicate {
    public static boolean sort(int arr[])
    { 
        
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                while(arr[i]==arr[j])
                {
                   
                    return true;
                }
               
            }
        }  
        return false;
    }
    public static void main(String args[])
    {
     int arr[]={8,3,4,3,9,6,7};
    System.out.println(sort(arr));
    }
}
