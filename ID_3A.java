import java.util.ArrayList;
import java.util.Scanner;

public class ID_3A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char starting[] = input.next().toCharArray();
        char endUp[] = input.next().toCharArray();

        int rowEnding = Character.getNumericValue(endUp[1]);

        int asciiValueE = (int) endUp[0];
        int columeSEnd = asciiValueE - 'A' + 1; // value of A is 65

        int rowStarting = Character.getNumericValue(starting[1]);

        int asciiValue = (int) starting[0];
        int columeStarting = asciiValue - 'A' + 1; // value of A is 65

        int[][] board = new int[8][8];

        // start
        board[rowStarting][columeStarting] = 0;

        // end
        board[rowEnding][columeSEnd] = 1;

        ArrayList<String> command = new ArrayList<>();

        while (rowStarting != rowEnding || columeStarting != columeSEnd) { // the logic in chatgpt is wrong
            if (rowStarting > rowEnding) {

                int disROW = Math.abs(rowStarting - rowEnding);
                int disCOL = Math.abs(columeSEnd - rowEnding);

                if (columeStarting > columeSEnd) {

                }

                if (columeStarting > columeSEnd) {

                }

                if (columeStarting == columeSEnd) {

                    for (int a = 0; a < disROW; a++) {
                        command.add("U");
                    }
                }

            }

            if (rowStarting < rowEnding) {

            }

        }

        if (rowStarting == rowEnding) {
            if (columeSEnd > columeStarting) {

                int disS1 = columeSEnd - columeStarting;

                for (int h = 0; h < disS1; h++) {
                    command.add("R");
                }

            }

            if (columeSEnd < columeStarting) {

                int disS2 = columeStarting - columeSEnd;

                for (int h = 0; h < disS2; h++) {
                    command.add("L");
                }

            }
        }

        for (int i = 0; i < command.size(); i++) {
            System.out.println(command.get(i));
        }

    }
}
