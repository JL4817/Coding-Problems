import java.util.Scanner;

public class ID_1327A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long k = input.nextLong();

            // Check two conditions:
            // 1. n and k must have the same parity (both odd or both even)
            // 2. k² must not exceed n (minimum possible sum is k²)
            if (n % 2 == k % 2 && k * k <= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}