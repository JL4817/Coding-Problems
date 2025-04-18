package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TS1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long totalSum = (long) n * (n + 1) / 2;

        // Check if sum is odd (impossible to divide equally)
        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            ArrayList<Integer> set1 = new ArrayList<>();
            ArrayList<Integer> set2 = new ArrayList<>();
            long targetSum = totalSum / 2;

            int i = n;
            while (i > 0) {
                if (targetSum >= i) {
                    set1.add(i);
                    targetSum -= i;
                } else {
                    set2.add(i);
                }
                i--;
            }

            // Sort set1 in ascending order to match the example
            Collections.sort(set1);
            Collections.sort(set2);

            // Print first set
            System.out.println(set1.size());
            for (i = 0; i < set1.size(); i++) {
                System.out.print(set1.get(i));
                if (i < set1.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Print second set
            System.out.println(set2.size());
            for (i = 0; i < set2.size(); i++) {
                System.out.print(set2.get(i));
                if (i < set2.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        br.close();
    }
}