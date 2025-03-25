import java.util.Arrays;
import java.util.Scanner;

public class ID_433B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = input.nextInt();
        }

        int[] sortedCost = cost.clone();
        Arrays.sort(sortedCost);

        long[] prefixCost = new long[n + 1];
        long[] prefixSorted = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixCost[i] = prefixCost[i - 1] + cost[i - 1];
            prefixSorted[i] = prefixSorted[i - 1] + sortedCost[i - 1];
        }

        int m = input.nextInt();

        for (int i = 0; i < m; i++) {
            int type = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();

            if (type == 1) {
                System.out.println(prefixCost[r] - prefixCost[l - 1]);
            } else {
                System.out.println(prefixSorted[r] - prefixSorted[l - 1]);
            }
        }

        input.close();
    }
}
