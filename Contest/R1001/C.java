package Contest.R1001;

import java.util.*;
import java.io.*;

public class C {
    public static void solve(Scanner scanner, PrintWriter out) {
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            out.println(findMaxSum(a));
        }
    }

    public static long findMaxSum(long[] original) {
        if (original.length == 1) {
            return original[0];
        }

        long maxSum = Arrays.stream(original).sum();
        long[] current = Arrays.copyOf(original, original.length);

        for (int rev = 0; rev <= 1; rev++) {
            for (int diff = 0; diff <= 1; diff++) {
                current = Arrays.copyOf(original, original.length);

                if (rev == 1) {
                    reverse(current);
                }

                if (diff == 1) {
                    current = getDifferenceSequence(current);
                }

                maxSum = Math.max(maxSum, getSum(current));
            }
        }

        return maxSum;
    }

    private static long getSum(long[] arr) {
        return Arrays.stream(arr).sum();
    }

    private static void reverse(long[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static long[] getDifferenceSequence(long[] arr) {
        if (arr.length <= 1)
            return arr;

        long[] diff = new long[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            diff[i - 1] = arr[i] - arr[i - 1];
        }

        return diff;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(scanner, out);
            out.flush();
        }
    }
}