import java.util.Arrays;
import java.util.Scanner;

public class ID_1992A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();

            long[] arr = new long[] { a, b, c };
            Arrays.sort(arr);

            // Maximize by distributing 5 increments strategically
            long result = maxProduct(arr[0], arr[1], arr[2]);
            System.out.println(result);
        }

        input.close();
    }

    private static long maxProduct(long x, long y, long z) {
        // Total 5 increments distributed optimally
        long max = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                long newX = x + i;
                long newY = y + j;
                long newZ = z + (5 - i - j);
                max = Math.max(max, newX * newY * newZ);
            }
        }
        return max;
    }
}