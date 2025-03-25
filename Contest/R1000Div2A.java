package Contest;

import java.util.Scanner;

public class R1000Div2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int t = 0; t < nTest; t++) {
            long l = input.nextLong();
            long r = input.nextLong();

            long result = countMinimalCoprime(l, r);
            System.out.println(result);
        }
        input.close();
    }

    private static long countMinimalCoprime(long l, long r) {
        if (l == r) {
            return (l == 1) ? 1 : 0;
        }

        long count = 0;

        if (l == 1) {
            count++;
            l = 2;
        }

        for (long i = l; i < r; i++) {
            if (gcd(i, i + 1) == 1) {
                count++;
            }
        }

        return count;
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}