import java.util.*;

class SplitArrayIntoKParts
{
    void splitArray(int arr[], int n, int k)
    {
        int size = (int)Math.ceil((double)n / k);
        int index = 0;

        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < size && index < n; j++)
            {
                System.out.print(arr[index] + " ");
                index++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        SplitArrayIntoKParts obj = new SplitArrayIntoKParts();
        obj.splitArray(arr, n, k);
    }
}