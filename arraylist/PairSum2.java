public class PairSum2 {
    public static void main(String args[]) {

        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 16;

        int n = arr.length;

        // find breaking point
        int bp = -1;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                bp = i;
                break;
            }
        }

        int left = bp + 1; // smallest
        int right = bp;    // largest

        while(left != right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                break;
            }

            if(sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
    }
}