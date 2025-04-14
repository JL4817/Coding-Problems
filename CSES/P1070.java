package CSES;

import java.util.Scanner;

public class P1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder sb = new StringBuilder();
            // First print all even numbers
            for (int i = 2; i <= n; i += 2) {
                sb.append(i).append(" ");
            }
            // Then print all odd numbers
            for (int i = 1; i <= n; i += 2) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        input.close();
    }
}