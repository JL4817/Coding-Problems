package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TK1072 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int k = 1; k <= n; k++) {
            long totalPlacements = ((long) k * k) * ((long) k * k - 1) / 2;
            long attackingPositions = 0;
            attackingPositions = 4L * (k - 1) * (k - 2);
            long nonAttackingPositions = totalPlacements - attackingPositions;
            System.out.println(nonAttackingPositions);
        }
        br.close();
    }
}
