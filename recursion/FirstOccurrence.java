public class FirstOccurrence {

    public static int firstOcc(int arr[], int i, int key) {
        if (i == arr.length)   // base case
            return -1;

        if (arr[i] == key)     // found
            return i;

        return firstOcc(arr, i + 1, key); 
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 4, 10};
        int key = 4;

        int index = firstOcc(arr, 0, key);

        System.out.println("Index = " + index);
    }
}