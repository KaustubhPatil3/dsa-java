public class RotatedArraySearch {

    public static int search(int arr[], int si, int ei, int key) {
        if (si > ei) return -1;

        int mid = (si + ei) / 2;

        if (arr[mid] == key) return mid;

        // Left sorted
        if (arr[si] <= arr[mid]) {
            if (key >= arr[si] && key < arr[mid]) {
                return search(arr, si, mid - 1, key);
            } else {
                return search(arr, mid + 1, ei, key);
            }
        }
        // Right sorted
        else {
            if (key > arr[mid] && key <= arr[ei]) {
                return search(arr, mid + 1, ei, key);
            } else {
                return search(arr, si, mid - 1, key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;

        int index = search(arr, 0, arr.length - 1, key);
        System.out.println("Index = " + index);
    }
}