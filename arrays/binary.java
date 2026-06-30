

public class binary
{
    public static int search(int arr[],int key)
    {
        int start=0,end=arr.length-1;
        while (start<=end) 
        {
            int mid=(start+end)/2;

            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            if(arr[mid]>key)
            {
                end=mid-1;
            }
        }
     return -1;
    }
    public static void main(String args[])
    {
        int arr[]={10,12,14,18,22};
        int key=14;
        int i=search(arr,key);
        if(i==-1)
        {
            System.out.println("not found");
        }
        else
        {
        System.out.println("Key= "+key+" Found at position= "+i);
        }

    }
    
}
