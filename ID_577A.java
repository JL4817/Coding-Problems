import java.util.Scanner;

public class ID_577A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long x = input.nextLong();
        long count = 0;
        for (long i = 1; i <= n; i++) {
            if (x % i == 0) {
                long j = x / i;
                if (j >= 1 && j <= n) {
                    count++;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}
//For i = 2:
//12 % 2 = 0 (so 2 is a divisor of 12)
//j = 12/2 = 6
//But 6 > 5, so this cell (2,6) doesn't exist in our 5×5 table
//We don't increment count
