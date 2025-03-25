package Contest.Div2R1002;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ntest = input.nextInt();

        for (int testCase = 0; testCase < ntest; testCase++) {
            int n = input.nextInt();
            int k = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            int sizeOfEach = n / k;
            int[] b = new int[n / 2 + 1];
            int bIndex = 0;

            for (int index = 1; index < k; index += 2) {
                int start = index * sizeOfEach;
                int end = Math.min(start + sizeOfEach, n);
                for (int i = start; i < end; i++) {
                    b[bIndex++] = arr[i];
                }
            }
            b[bIndex] = 0;

            int cost = b.length;
            for (int i = 0; i < b.length; i++) {
                if (b[i] != i + 1) {
                    cost = i + 1;
                    break;
                }
            }

            System.out.println(cost);
        }

        input.close();
    }
}