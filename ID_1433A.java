import java.util.ArrayList;
import java.util.Scanner;

public class ID_1433A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrTest = input.nextInt();

        input.nextLine();

        for (int i = 1; i <= nrTest; i++) {
            int thenNum = input.nextInt();
            int total = 0;

            int length = String.valueOf(thenNum).length();

            if (length == 4) {
                int firstDigit = thenNum / 1000;
                total += firstDigit * 10;
                System.out.println(total);

            } else if (length == 3) {
                int firstDigit = thenNum / 100;
                total += (firstDigit - 1) * 10;
                total += 6;
                System.out.println(total);

            } else if (length == 2) {
                int firstDigit = thenNum / 10;
                total += (firstDigit - 1) * 10;
                total += 3;
                System.out.println(total);

            } else if (length == 1) {
                if (thenNum == 1) {
                    System.out.println(1);
                } else {
                    total += (thenNum - 1) * 10;
                    total += 1;
                    System.out.println(total);
                }
            }

        }
    }
}
