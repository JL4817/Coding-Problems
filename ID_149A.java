import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ID_149A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        input.nextLine();

        int[] monthlyGrowth = Arrays.stream(input.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Sort monthly growth in descending order
        Integer[] sortedGrowth = Arrays.stream(monthlyGrowth)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        // If target is 0, no watering is needed
        if (k == 0) {
            System.out.println(0);
            input.close();
            return;
        }

        int totalGrowth = 0;
        int monthsWatered = 0;

        // Select months that contribute to the target growth
        // This automatically goes through from i=0 to i<length and does i++ so it doesn't matter
        for (int growth : sortedGrowth) {
            if (totalGrowth < k) {
                totalGrowth += growth;
                monthsWatered++;
            }
        }

        // Check if the target growth is achievable
        if (totalGrowth < k) {
            System.out.println(-1);
        } else { //They are the same now
            System.out.println(monthsWatered);
        }

        input.close();
    }
}