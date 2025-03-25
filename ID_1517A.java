import java.util.Scanner;

public class ID_1517A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            long n = input.nextLong();

            if (n % 2050 != 0) {
                System.out.println(-1);
                continue;
            }

            long quotient = n / 2050;

            long sum = 0;
            while (quotient > 0) {
                sum += quotient % 10;
                quotient /= 10;
            }

            System.out.println(sum > 0 ? sum : -1);
        }

        input.close();
    }
}
/*
 * The corrected code will properly handle all the test cases:
 * 
 * 205: -1 (not divisible by 2050)
 * 2050: 1 (2050/2050 = 1)
 * 4100: 2 (4100/2050 = 2)
 * 20500: 1 (20500/2050 = 10 → sum of digits = 1)
 * 22550: 2 (22550/2050 = 11 → sum of digits = 2)
 * 25308639900: 36 (25308639900/2050 = 12346165 → sum of digits = 36)
 */