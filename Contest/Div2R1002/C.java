package Contest.Div2R1002;

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int[] remaining = new int[n];
            Arrays.fill(remaining, 0);

            for (int i = 0; i < n; i++) {
                int minQueue = -1;
                int minCustomers = Integer.MAX_VALUE;

                for (int j = 0; j < n; j++) {
                    if (remaining[j] < minCustomers) {
                        minQueue = j;
                        minCustomers = remaining[j];
                    }
                }

                remaining[minQueue] = 0;

                for (int j = 0; j < n; j++) {
                    remaining[j] += a[minQueue][j];
                }
            }

            int mex = calculateMEX(remaining);
            System.out.println(mex);
        }

        sc.close();
    }

    public static int calculateMEX(int[] arr) {
        Arrays.sort(arr);
        int mex = 0;
        for (int num : arr) {
            if (num == mex) {
                mex++;
            }
        }
        return mex;
    }
}
