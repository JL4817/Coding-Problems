import java.util.Scanner;

public class ID_1409B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long n = scanner.nextLong();
            System.out.println(minProduct(a, b, x, y, n));
        }
        scanner.close();
    }

    public static long minProduct(long a, long b, long x, long y, long n) {
        // Calculate how much we can decrease a and b
        long maxDecA = a - x;
        long maxDecB = b - y;

        // Strategy 1: Decrease a first, then b
        long n1 = n;
        long decA1 = Math.min(maxDecA, n1);
        long a1 = a - decA1;
        n1 -= decA1;

        long decB1 = Math.min(maxDecB, n1);
        // If n1 is smaller than maxDecB that means that this amount of n1 is left and that is subtracted instead
        long b1 = b - decB1;
        n1 -= decB1; //Not needed as there is only two a and b

        long product1 = a1 * b1;

        // Strategy 2: Decrease b first, then a
        long n2 = n;
        long decB2 = Math.min(maxDecB, n2);
        long b2 = b - decB2;
        n2 -= decB2;

        long decA2 = Math.min(maxDecA, n2);
        long a2 = a - decA2;
        n2 -= decA2; //Not needed as there is only two a and b

        long product2 = a2 * b2;

        // Return the minimum product
        return Math.min(product1, product2);
    }
}