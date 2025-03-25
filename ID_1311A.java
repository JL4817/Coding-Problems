import java.util.Scanner;

public class ID_1311A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int moves = 0;

            if (a == b) {
                moves = 0;
            } else if (a > b) {
                if ((a - b) % 2 == 0) {
                    moves = 1;
                } else {
                    moves = 2;
                }
            } else if (b > a) {
                if ((b - a) % 2 == 0) {
                    moves = 2;
                } else {
                    moves = 1;
                }
            }
            System.out.println(moves);
        }
        input.close();
    }
}
