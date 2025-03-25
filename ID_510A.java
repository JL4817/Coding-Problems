import java.util.Scanner;

public class ID_510A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int row = input.nextInt();
        // int col = input.nextInt();

        int row = input.nextInt();
        int col = input.nextInt();

        String hash = "#";
        String dot = ".";

        boolean rightHand = true;
        int count = 0; // Track row pattern (even: full row of '#', odd: '#'' at one side)

        for (int i = 0; i < row; i++) {
            if (count % 2 == 0) {

                for (int j = 0; j < col; j++) {
                    System.out.print(hash);
                }
            } else {
                if (rightHand == true) {
                    for (int j = 0; j < col - 1; j++) {
                        System.out.print(dot);
                    }
                    System.out.print(hash);

                } else {
                    System.out.print(hash);
                    for (int j = 1; j < col; j++) {
                        System.out.print(dot);
                    }
                }
                rightHand = !rightHand;

            }

            System.out.println(); // Move to the next row
            count++;

        }

    }
}
