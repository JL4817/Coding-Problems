import java.util.Scanner;

public class ID_1348A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int sum1 = 0, sum2 = 0;

            // largest coin to sum1
            sum1 += Math.pow(2, n);

            // next (n/2 - 1) largest coins to sum1
            for (int i = 1; i < n / 2; i++) {
                sum1 += Math.pow(2, i);
            }

            // remaining n/2 coins to sum2
            for (int i = n / 2; i < n; i++) {
                sum2 += Math.pow(2, i);
            }

            int minDiff = Math.abs(sum1 - sum2);
            System.out.println(minDiff);
        }
        input.close();
    }
}