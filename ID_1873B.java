import java.util.Arrays;
import java.util.Scanner;

public class ID_1873B {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int caseNr = input.nextInt();
        input.nextLine();
        for (int n = 0; n < caseNr; n++) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                String line = input.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        score += point(i, j);
                    }
                }
            }
            System.out.println(score);
        }
        input.close();
    }

    public static int point(int row, int col) {
        // The size of the matrix is fixed at 10x10
        if (row == 0 || col == 0 || row == 9 || col == 9)
            return 1;
        if (row == 1 || col == 1 || row == 8 || col == 8)
            return 2;
        if (row == 2 || col == 2 || row == 7 || col == 7)
            return 3;
        if (row == 3 || col == 3 || row == 6 || col == 6)
            return 4;
        if (row == 4 || col == 4 || row == 5 || col == 5)
            return 5;

        // Default case (not reachable for a 10x10 matrix)
        return -1;
    }
}
