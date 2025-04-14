import java.util.Scanner;

public class ID_1624B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            solveTest(a, b, c);
        }
        scanner.close();
    }

    public static void solveTest(int a, int b, int c) {
        // Case 1: Try to modify 'a'
        int newA = b - (c - b);
        if (isValidModification(a, newA)) {
            System.out.println("YES");
            return;
        }
        // Case 2: Try to modify 'b'
        int newB = a + (c - a) / 2;
        if (isValidModification(b, newB) && (c - a) % 2 == 0) {
            System.out.println("YES");
            return;
        }
        // Case 3: Try to modify 'c'
        int newC = a + 2 * (b - a);
        if (isValidModification(c, newC)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    private static boolean isValidModification(int original, int modified) {
        // Check conditions:
        // 1. Modified value is >= original
        // 2. Modified is divisible by original
        // 3. Modified is not zero
        return modified >= original &&
                modified % original == 0 &&
                modified != 0;
    }
}