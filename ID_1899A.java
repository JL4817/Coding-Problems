import java.util.Scanner;

public class ID_1899A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int number = input.nextInt();
            boolean isVanyaWinner = false;

            // Vanya's optimal move
            if ((number + 1) % 3 == 0) {
                number++;
                isVanyaWinner = true;
            } else if ((number - 1) % 3 == 0) {
                number--;
                isVanyaWinner = true;
            }

            if (isVanyaWinner) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        input.close();
    }
}
