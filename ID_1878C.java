import java.util.ArrayList;
import java.util.Scanner;

public class ID_1878C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong(); // from 1 to n
            long k = input.nextLong(); // how distinct numbers
            long x = input.nextLong(); // the target

            // Minimum possible sum with k smallest numbers
            long minSum = k * (k + 1) / 2;
            // Maximum possible sum with k largest numbers
            long maxSum = k * (2 * n - k + 1) / 2;

            // Check if x is in the possible range
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}