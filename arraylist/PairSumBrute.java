public class PairSumBrute {
    public static void main(String args[]) {

        int arr[] = {2, 4, 6, 8, 10};
        int target = 10;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}