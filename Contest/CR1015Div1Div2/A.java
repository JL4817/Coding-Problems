package Contest.CR1015Div1Div2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] result = findPermutation(n);

            if (result == null) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(result[i]);
                    if (i < n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    private static int[] findPermutation(int n) {
        if (n == 2 || n == 4) {
            return null;
        }
        if (n == 3) {
            return new int[]{3, 2, 1};
        }

        int[] perm = new int[n];
        perm[0] = 1;
        perm[1] = 5;
        perm[2] = 2;
        perm[3] = 3;
        perm[4] = 4;

        int next = 6;
        for (int i = 5; i < n; i++) {
            perm[i] = next++;
        }

        if (n == 5) {
            return perm;
        }

        for (int i = 2; i <= n; i++) {
            int maxVal = Math.max(perm[i - 2], perm[i - 1]);
            if (maxVal % i != i - 1) {
                perm = new int[n];
                perm[0] = 1;

                for (int j = 1; j < n; j++) {
                    int prev = perm[j - 1];
                    for (int val = 1; val <= n; val++) {
                        boolean used = false;
                        for (int k = 0; k < j; k++) {
                            if (perm[k] == val) {
                                used = true;
                                break;
                            }
                        }
                        if (used) continue;
                        int maxValue = Math.max(prev, val);
                        if (j + 1 <= 1 || maxValue % (j + 1) == j) {
                            perm[j] = val;
                            break;
                        }
                    }
                    if (perm[j] == 0) {
                        return null;
                    }
                }
                break;
            }
        }
        for (int i = 2; i <= n; i++) {
            int maxVal = Math.max(perm[i - 2], perm[i - 1]);
            if (maxVal % i != i - 1) {
                return null;
            }
        }

        return perm;
    }
}