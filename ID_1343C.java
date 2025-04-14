import java.util.*;

public class ID_1343C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }
            System.out.println(findMaxAlternatingSubsequence(arr));
        }
        input.close();
    }

    public static long findMaxAlternatingSubsequence(long[] arr) {
        if (arr.length == 0) return 0;

        long maxPos = Long.MIN_VALUE;
        long maxNeg = Long.MIN_VALUE;

        for (long num : arr) {
            if (num > 0) {
                // If current number is positive
                // Update max positive sum by checking against max negative sum (if alternating)
                maxPos = Math.max(num, (maxNeg != Long.MIN_VALUE ? maxNeg + num : num));
            } else {
                // If current number is negative
                // Update max negative sum by checking against max positive sum (if alternating)
                maxNeg = Math.max(num, (maxPos != Long.MIN_VALUE ? maxPos + num : num));
            }
        }
        // Return the maximum of either positive or negative subsequence
        return Math.max(maxPos, maxNeg);
    }
}