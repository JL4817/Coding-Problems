import java.util.*;

public class ID_1850D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            input.nextLine();

            int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);
            int maxLength = findMaxBalancedSubsequence(array, k);

            // Minimum removals is total length minus max subsequence length
            System.out.println(n - maxLength);
        }
        input.close();
    }

    private static int findMaxBalancedSubsequence(int[] arr, int k) {
        if (arr.length == 0){
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] <= k) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }
}