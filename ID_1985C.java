import java.util.Arrays;
import java.util.Scanner;

public class ID_1985C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            long[] arr = Arrays.stream(input.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

            int goodCount = 0;
            // Check each prefix
            for (int i = 0; i < n; i++) {
                if (isGood(arr, i + 1)) {
                    goodCount++;
                }
            }
            System.out.println(goodCount);
        }
        input.close();
    }

    // Check if a prefix of length is good
    private static boolean isGood(long[] arr, int length) {
        // Calculate the sum of all elements in the prefix
        long totalSum = 0;
        for (int i = 0; i < length; i++) {
            totalSum += arr[i];
        }

        if (length == 1) {
            return arr[0] == 0;
        }

        // Check if any element equals the sum of all others
        for (int i = 0; i < length; i++) {
            // Calculate sum without current element (The sum is only up until the Prefix)
            long sumWithoutCurrent = totalSum - arr[i];
            // If current element equals sum of all others
            if (arr[i] == sumWithoutCurrent) {
                return true;
            }
        }
        return false;
    }
}