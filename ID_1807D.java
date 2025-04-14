import java.util.Scanner;

public class ID_1807D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int q = input.nextInt();

            long[] prefixSum = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + input.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int l = input.nextInt();
                int r = input.nextInt();
                int k = input.nextInt();

                long totalSum = prefixSum[n] - (prefixSum[r] - prefixSum[l - 1]) + (long) (r - l + 1) * k;

                System.out.println(totalSum % 2 == 1 ? "YES" : "NO");
            }
        }

        input.close();
    }
}