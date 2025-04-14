import java.util.Scanner;

public class ID_1353C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(calculateMinMoves(n));
        }
        input.close();
    }

    private static long calculateMinMoves(int n) {
        if (n == 1) {
            return 0;
        }

        long totalMoves = 0;
        int layers = n / 2;

        for (int layer = 1; layer <= layers; layer++) {
            int cellsInLayer = 8 * layer;

            totalMoves += (long) layer * cellsInLayer;
        }
        return totalMoves;
    }
}
