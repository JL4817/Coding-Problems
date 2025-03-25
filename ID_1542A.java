import java.util.Arrays;
import java.util.Scanner;

public class ID_1542A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = input.nextInt();

            int[] arr = new int[n * 2];
            int even = 0;
            int odd = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = input.nextInt();

                if (arr[j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println(even == n && odd == n ? "YES" : "NO");

        }
        input.close();
    }
}
