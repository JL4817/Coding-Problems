import java.io.*;
import java.util.*;

public class ID_1832B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long[] arr = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(arr);
            long maxSum = calculateMaxSum(arr, k);
            System.out.println(maxSum);
        }
    }

    private static long calculateMaxSum(long[] arr, int k) {
        int n = arr.length;
        long[] prefixSum = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        long maxSum = 0;

        for (int i = 0; i <= k; i++) {
            if (2 * i + (k - i) <= n) {
                long currentSum = prefixSum[n - (k - i)] - prefixSum[2 * i];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}