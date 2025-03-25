import java.util.Scanner;

public class ID_1883A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        while (t-- > 0) {
            String pin = input.nextLine();

            int current = 1;
            int totalTime = 0;

            for (int i = 0; i < 4; i++) {
                int target = Character.getNumericValue(pin.charAt(i));
                if (target == 0) { // 0 ist 10th digit, so just treat it as 10
                    target = 10;
                }

                int moves = Math.abs(target - current);

                // plus one second for pressing
                totalTime += moves + 1;

                // update current position
                current = target;
            }

            System.out.println(totalTime);
        }

        input.close();
    }
}