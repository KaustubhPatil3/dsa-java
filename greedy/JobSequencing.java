import java.util.Arrays;

public class JobSequencing {

    public static void main(String[] args) {
        int[] id       = {1, 2, 3, 4};
        int[] deadline = {4, 1, 1, 1};
        int[] profit   = {20, 10, 40, 30};

        int n = id.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> profit[b] - profit[a]);

        boolean[] slot = new boolean[n];
        int totalProfit = 0;

        for (int i : idx) {
            for (int j = Math.min(n, deadline[i]) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    totalProfit += profit[i];
                    System.out.print("Job" + id[i] + " ");
                    break;
                }
            }
        }

        System.out.println("\nMax profit: " + totalProfit);
    }
}