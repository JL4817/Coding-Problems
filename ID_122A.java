import java.util.Scanner;

public class ID_122A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Redundant cause this is below checked, but just exit it
        if (number % 7 == 0 || number % 4 == 0) {
            System.out.println("YES");
            System.exit(0);

        }

        int[] luckyNumbers = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };

        boolean isLucky = false;
        for (int lucky : luckyNumbers) {
            if (number % lucky == 0) {
                isLucky = true;
                break;
            }
        }

        if (isLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}