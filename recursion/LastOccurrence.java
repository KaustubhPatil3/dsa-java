public class LastOccurrence {

    public static int lastOcc(int arr[], int i, int key) {
        if (i == arr.length)   // base case
            return -1;

        int isFound = lastOcc(arr, i + 1, key); // recursive call

        if (isFound == -1 && arr[i] == key)
            return i;

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 4, 10};
        int key = 4;

        int index = lastOcc(arr, 0, key);
        System.out.println("Index = " + index);
    }
}