import java.util.Scanner;

public class ID_1476A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n >= k) {
                // If k divides n, all elements can be 1
                if (n % k == 0) {
                    System.out.println(1);
                } else {
                    // Find how much we need to add to make sum divisible by k
                    long remainder = n % k;
                    long needToAdd = (k - remainder) % k;

                    if (needToAdd == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            } else {
                // n < k case: We need each element to be at least ceil(k/n)
                long minElement = (k + n - 1) / n;
                System.out.println(minElement);
            }
        }
        sc.close();
    }
}