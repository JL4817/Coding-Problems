package Contest.R1001;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int[] clocks = new int[n];

            for (int i = 0; i < n; i++) {
                clocks[i] = scanner.nextInt();
            }

            System.out.println(canSurvive(clocks) ? "YES" : "NO");
        }
    }

    private static boolean canSurvive(int[] clocks) {
        long totalTime = 0;
        int maxTime = 0;

        for (int time : clocks) {
            totalTime += time;
            maxTime = Math.max(maxTime, time);
        }

        return totalTime >= 2L * maxTime;
    }
}
