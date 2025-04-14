package Contest.ER177Div2;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = scanner.nextInt();
            }

            int[] d = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                d[i] = scanner.nextInt();
            }

            int[] answer = solve(n, p, d);

            for (int i = 0; i < n; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int[] solve(int n, int[] p, int[] d) {
        int[] results = new int[n];

        // Make a copy of the original array
        int[] arr = new int[n + 1];
        System.arraycopy(p, 0, arr, 0, p.length);

        // Track positions that have been zeroed
        for (int i = 1; i <= n; i++) {
            // Zero out the position specified by the query
            arr[d[i]] = 0;

            // Calculate the minimum operations needed
            results[i-1] = calculateMinOperations(arr, n);
        }

        return results;
    }

    private static int calculateMinOperations(int[] arr, int n) {
        // Count how many zeros we have
        int zeros = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // Create a bipartite graph and solve the maximum bipartite matching
        // This tells us how many zeros can be placed correctly
        boolean[] used = new boolean[n + 1];
        int[] nums = new int[n + 1]; // Store which numbers are at each position

        // Initialize nums array
        for (int i = 1; i <= n; i++) {
            nums[i] = arr[i];
        }

        // Count matches - positions where we already have correct numbers
        int matches = 0;
        for (int i = 1; i <= n; i++) {
            if (nums[i] == i) {
                matches++;
                used[i] = true;
            }
        }

        // Calculate the minimum operations needed
        return n - matches;
    }
}