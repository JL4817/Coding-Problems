import java.util.Scanner;

public class ID_1915B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();

        for (int n = 0; n < nTest; n++) {
            boolean foundA = false;
            boolean foundB = false;
            boolean foundC = false;
            char[][] array = new char[3][3];
            int row = 0;

            for (int i = 0; i < 3; i++) {
                array[i] = input.nextLine().toCharArray();
                for (int j = 0; j < 3; j++) {
                    if (array[i][j] == '?') {
                        row = i;
                    }
                }

            }

            for (int k = 0; k < 3; k++) {
                if (array[row][k] == 'A') {
                    foundA = true;
                } else if (array[row][k] == 'B') {
                    foundB = true;
                } else if (array[row][k] == 'C') {
                    foundC = true;
                }
            }

            if (foundA && foundB) {
                System.out.println("C");
            } else if (foundA && foundC) {
                System.out.println("B");
            } else if (foundC && foundB) {
                System.out.println("A");
            }
        }
        input.close();
    }
}
