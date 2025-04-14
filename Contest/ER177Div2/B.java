package Contest.ER177Div2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            long x = input.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLong();
            }

            long sumA = 0;
            for (int i = 0; i < n; i++) {
                sumA += a[i];
            }

            if (sumA * k < x) {
                System.out.println(0);
                continue;
            }

            long result = 0;
            long[] prefixSums = new long[2 * n + 1];
            prefixSums[0] = 0;

            for (int i = 0; i < 2 * n; i++) {
                prefixSums[i + 1] = prefixSums[i] + a[i % n];
            }

            for (int l = 0; l < n; l++) {
                long neededSum = x;

                if (prefixSums[n] - prefixSums[l] < neededSum) { //Find sum
                    long moreSum = neededSum - (prefixSums[n] - prefixSums[l]);
                    long cyclesToSkip = moreSum / sumA;
                    if (moreSum % sumA > 0) {
                        cyclesToSkip++;
                    }
                    if (cyclesToSkip >= k) { //Complete cycles needed
                        continue;
                    }
                    neededSum -= cyclesToSkip * sumA;

                    int left = l;
                    int right = n;
                    while (left < right) {
                        int mid = left + (right - left) / 2;
                        if (prefixSums[mid + 1] - prefixSums[l] >= neededSum) {
                            right = mid;
                        } else {
                            left = mid + 1;
                        }
                    }
                    if (prefixSums[left + 1] - prefixSums[l] >= neededSum) {
                        result += k - cyclesToSkip;
                    }

                } else {
                    int left = l;
                    int right = n;
                    while (left < right) {
                        int mid = left + (right - left) / 2;

                        if (prefixSums[mid + 1] - prefixSums[l] >= neededSum) {
                            right = mid;
                        } else {
                            left = mid + 1;
                        }
                    }

                    if (left < n && prefixSums[left + 1] - prefixSums[l] >= neededSum) {
                        result += k;
                    }
                }
            }
            System.out.println(result);
        }
        input.close();
    }
}
//Find suitable segment within the first repeat of array a
//If not, calculate how many complete cycles of array a we need to skip --> binary search
//Find the smallest position r where the sum from l to r is at least x