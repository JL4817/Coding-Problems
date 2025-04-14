import java.util.Arrays;
import java.util.Scanner;

public class ID_363B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine();
        int[] height = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(minSubarrayIndex(height, k));

        input.close();
    }

    public static int minSubarrayIndex(int[] arr, int k) {
        int minSum = 0;
        int currentSum = 0;
        int minIndex = 1; // Initialize to 1 since output is 1-indexed

        // Calculate initial sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        minSum = currentSum;

        // Slide the window and find minimum sum
        for (int i = 1; i <= arr.length - k; i++) {
            currentSum = currentSum - arr[i - 1] + arr[i + k - 1];

            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i + 1; // +1 for 1-indexed output
            }
        }
        return minIndex;
    }
}
