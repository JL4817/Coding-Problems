package Contest.C49Training;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            long n = input.nextLong();
            System.out.println(solve(n));
        }
    }

    public static int solve(long n) {
        if (n <= 3) {
            return 1;
        }

        long nextN = n / 4;
        return 2 * solve(nextN);
    }
}
