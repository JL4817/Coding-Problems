import java.util.*;

public class ID_474B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] prefixSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
            prefixSum[i] = sum; // cumulative sum e.g. [2, 9, 12, 16, 25]
        }

        int m = input.nextInt(); // number of queries
        int[] queries = new int[m];

        for (int i = 0; i < m; i++) {
            queries[i] = input.nextInt();
        }

        StringBuilder output = new StringBuilder();

        for (int query : queries) {
            int pile = binarySearch(prefixSum, query) + 1;
            output.append(pile).append("\n");
        }

        System.out.print(output);
        input.close();
    }

    private static int binarySearch(int[] prefixSum, int target) {
        int left = 0;
        int right = prefixSum.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (prefixSum[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
/*
 * We repeatedly calculate the middle index (mid), and compare the
 * prefixSum[mid] to the target:
 * If prefixSum[mid] < target, the target must lie in the right half of the
 * array (so we move the left pointer to mid + 1).
 * Otherwise, the target must lie in the left half, so we move the right pointer
 * to mid.
 * 
 * This process continues until left == right, which will be the index where the
 * prefixSum[left] is greater than or equal to the target.
 * 
 * https://www.cs.usfca.edu/~galles/visualization/Search.html
 */
