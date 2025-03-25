import java.util.Scanner;

public class ID_1873C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();

        for (int test = 0; test < nTest; test++) {
            int totalScore = 0;
            char[][] grid = new char[10][10];

            for (int i = 0; i < 10; i++) {
                String line = input.nextLine();
                grid[i] = line.toCharArray();
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X') {
                        // Calculate the score based on the position
                        int ring = getRing(i, j);
                        totalScore += ring;
                    }
                }
            }

            System.out.println(totalScore);
        }
    }

    private static int getRing(int row, int col) {
        int distanceFromCenter = Math.max(Math.abs(row - (int) 4.5), Math.abs(col - (int) 4.5));

        if (distanceFromCenter <= 0.5)
            return 5; // Center
        if (distanceFromCenter <= 1.5)
            return 4; // Second ring
        if (distanceFromCenter <= 2.5)
            return 3; // Third ring
        if (distanceFromCenter <= 3.5)
            return 2; // Fourth ring
        if (distanceFromCenter <= 4.5)
            return 1; // Outermost ring
        return 0; // Outside the target
    }
}