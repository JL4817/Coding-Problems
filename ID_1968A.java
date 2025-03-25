import java.util.Scanner;

public class ID_1968A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int x = input.nextInt();
            int maxResult = Integer.MIN_VALUE;
            int bestY = 1;

            for (int y = 1; y < x; y++) {
                int currentResult = findGCD(x, y) + y;
                if (currentResult > maxResult) {
                    maxResult = currentResult;
                    bestY = y;
                }
            }
            System.out.println(bestY);
        }
    }

    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
