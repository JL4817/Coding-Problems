package CSES;

import java.util.Scanner;

public class WA1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = n + " ";
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else { //odd
                n = n * 3 + 1;
            }
            str += n + " ";
        }
        System.out.println(str.trim());
        sc.close();
    }
}
