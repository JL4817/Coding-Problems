package Contest.ER177Div2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long t = input.nextLong();
        input.nextLine();
        while (t-- > 0) {
            long n = input.nextLong();
            System.out.println(n * 2);
        }
        input.close();
    }
}
