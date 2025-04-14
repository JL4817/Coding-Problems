package Contest.CR1015Div1Div2;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            System.out.println(canSolve(a) ? "Yes" : "No");
        }

        scanner.close();
    }

    public static boolean canSolve(long[] a) {
        Set<Long> allValues = new HashSet<>();
        for (long val : a) {
            allValues.add(val);
        }

        // For each possible minimum value
        for (long minVal : allValues) {
            // Check if we can arrange the array such that:
            // 1. At least one element equal to minVal is in the left part
            // 2. The GCD of the right part equals minVal
            int countMinVal = 0;
            for (long val : a) {
                if (val == minVal) {
                    countMinVal++;
                }
            }

            if (countMinVal > 0) {
                List<Long> divisibleByMin = new ArrayList<>();
                boolean usedOneMinVal = false;

                for (long val : a) {
                    if (val == minVal) {
                        if (!usedOneMinVal) {
                            usedOneMinVal = true;
                        } else {
                            divisibleByMin.add(val);
                        }
                    } else if (val % minVal == 0) {
                        divisibleByMin.add(val);
                    }
                }

                long gcdOfDivisible = 0;
                for (long val : divisibleByMin) {
                    if (gcdOfDivisible == 0) {
                        gcdOfDivisible = val;
                    } else {
                        gcdOfDivisible = gcd(gcdOfDivisible, val);
                    }
                }

                if (!divisibleByMin.isEmpty() && gcdOfDivisible == minVal) {
                    return true;
                }
            }
        }

        return false;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}