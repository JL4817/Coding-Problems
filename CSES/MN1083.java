package CSES;

import java.util.Scanner;

public class MN1083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // Calculate expected sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;

        // Calculate actual sum of the n-1 numbers
        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += input.nextInt();
        }

        // The missing number is the difference
        System.out.println(expectedSum - actualSum);

        input.close();
    }
}