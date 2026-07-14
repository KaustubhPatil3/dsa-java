public class Kadanealgo {

    public static void kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;   
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 8,-9,-1,3,5};
        kadane(arr);
    }
}