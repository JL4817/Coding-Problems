import java.util.Scanner;

public class ID_1999B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n-- > 0) {
            int a1 = input.nextInt();
            int a2 = input.nextInt();
            int b1 = input.nextInt();
            int b2 = input.nextInt();

            int numWays = 0;
            if (calculate(a1, b1) + calculate(a2, b2) > 0) {
                numWays += 1;
            }
            if (calculate(a1, b2) + calculate(a2, b1) > 0) {
                numWays += 1;
            }
            if (calculate(a2, b1) + calculate(a1, b2) > 0) {
                numWays += 1;
            }
            if (calculate(a2, b2) + calculate(a1, b1) > 0) {
                numWays += 1;
            }
            System.out.println(numWays);
        }
        input.close();
    }

    public static int calculate(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        if (a < b) return -1;
        return 0;
    }
}