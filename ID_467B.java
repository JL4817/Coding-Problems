import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ID_467B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // Number of soldier types
        int m = Integer.parseInt(st.nextToken()); // Number of players (excluding Fedor)
        int k = Integer.parseInt(st.nextToken()); // Maximum allowed difference

        int[] armies = new int[m + 1];

        // Read army values for each player
        for (int i = 0; i < m + 1; i++) {
            armies[i] = Integer.parseInt(br.readLine());
        }

        int fedorArmy = armies[m]; // Fedor is the (m+1)th player
        int friends = 0;

        // Check each player against Fedor
        for (int i = 0; i < m; i++) {
            int bitDifference = countBitDifferences(armies[i], fedorArmy);
            if (bitDifference <= k) {
                friends++;
            }
        }

        System.out.println(friends);
        br.close();
    }

    // Count the number of differing bits between two integers
    private static int countBitDifferences(int a, int b) {
        // XOR will have 1s in positions where bits differ
        int xor = a ^ b;

        int count = 0;
        // Count the number of 1s in the XOR result
        while (xor > 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor >>= 1;
        }

        return count;
    }
}