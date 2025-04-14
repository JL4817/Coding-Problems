package CSES;

import java.util.Arrays;
import java.util.Scanner;

public class IA1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        input.nextLine();
        int[] a = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long total = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                total += a[i] - a[i + 1];
                a[i + 1] = a[i];
            }
        }
        System.out.println(total);
        input.close();
    }
}
