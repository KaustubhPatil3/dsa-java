public class CheckSorted {

    public static boolean isSorted(int arr[], int i) 
    {
        if (i == arr.length - 1)   
            return true;

        if (arr[i] > arr[i + 1])   
            return false;

        return isSorted(arr, i + 1); // recursive call
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        if (isSorted(arr, 0))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}