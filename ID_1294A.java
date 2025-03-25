import java.util.Arrays;
import java.util.Scanner;

public class ID_1294A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();
        for (int i = 0; i < numTest; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int n = input.nextInt();

            int max = Math.max(Math.max(a, b), c);
            int coinNeeded = (max - a) + (max - b) + (max - c);
            int remainingCoin = n - coinNeeded;

            if (remainingCoin >= 0 && remainingCoin % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        input.close();
    }
}