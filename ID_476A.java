import java.util.Scanner;

public class ID_476A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int minMoves = (n / 2) + (n % 2);

        // Find the smallest multiple of m that is >= minMoves
        int result = -1;
        for (int moves = minMoves; moves <= n; moves++) {
            if (moves % m == 0) {
                result = moves;
                break;
            }
        }

        System.out.println(result);
        input.close();
    }
}