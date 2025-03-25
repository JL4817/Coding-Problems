package Contest;

import java.util.Scanner;

public class CodeTonR9D12A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        input.nextLine();
        for (int i = 0; i < nrOfTestCase; i++) {
            int n = input.nextInt();
            int[] sequence = new int[n];
            int modCurr = 1;

            for (int k = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    // Check the modulo condition
                    if (sequence[i] % (i + 1) == sequence[j] % (j + 1)) {
                        // If the remainders are the same, modify the sequence to avoid this conflict
                    }
                }
            }

        }
    }
}
