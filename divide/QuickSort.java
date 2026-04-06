public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) return;   // base case

        int pIdx = partition(arr, si, ei); // get pivot index

        quickSort(arr, si, pIdx - 1);  // left part
        quickSort(arr, pIdx + 1, ei);  // right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];   // last element as pivot
        int i = si - 1;        // place for smaller elements

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        // place pivot at correct position
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // pivot index
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}