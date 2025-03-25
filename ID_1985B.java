import java.util.Scanner;

public class ID_1985B {
    public static void main(String args[]) {
        // sum = x + 2x + 3x....
        // sum = x(1+2+3+...+k) = x * ((k)(k+1))/2
        // kx <= n, => k <= n/x
        // z.B. n=15, x=4, k=3.75, => 3

        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = input.nextInt();

            int sum = 0;
            int max = 0;
            int theX = 0;
            int k;
            for (int x = 2; x <= n; x++) {
                k = n / x;
                sum = x * ((k) * (k + 1) / 2);

                if (sum > max) {
                    max = sum;
                    theX = x;
                }
            }
            System.out.println(theX);
        }

    }
}
