import java.util.Scanner;

public class ID_1850C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTest; i++) {
            StringBuilder answer = new StringBuilder();

            // Process the 8 rows for each test case
            String[] grid = new String[8];
            for (int j = 0; j < 8; j++) {
                grid[j] = input.nextLine();
            }

            for (int col = 0; col < 8; col++) {
                for (int row = 0; row < 8; row++) {
                    if (grid[row].charAt(col) != '.') {
                        answer.append(grid[row].charAt(col));
                    }
                }
            }
            System.out.println(answer.toString());
        }
        input.close();
    }
}
