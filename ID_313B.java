import java.util.Scanner;

public class ID_313B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int m = input.nextInt();

        // Precompute adjacent matches
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            dp[i] = dp[i-1] + (s.charAt(i) == s.charAt(i-1) ? 1 : 0);
        }
        // Process queries
        for (int i = 0; i < m; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            // Convert to 0-based indexing
            l--;
            r--;
            // The answer is the number of matches from l to r-1
            System.out.println(dp[r] - dp[l]);
        }
        input.close();
    }
}