import java.util.Scanner;

public class ID_1475B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for (int n = 0; n < nTest; n++) {
            int year = input.nextInt();

            if (year % 2020 <= year / 2020) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        input.close();
    }
}/*
  * You are given a number n and you need to determine if it can be expressed as:
  * n = 2020 x a + 2021 x b
  * also: a = n/2020 und b = n%2020
  */
