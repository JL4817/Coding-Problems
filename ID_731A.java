import java.util.Scanner;

public class ID_731A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int count = 0;
        char current = 'a';

        for (int i = 0; i < line.length(); i++) {
            char target = line.charAt(i);
            int clockwise = Math.abs(target - current);
            int counterClockwise = 26 - clockwise;
            // Since the wheel is circular, the backward distance is 26 − clockwise, as
            // there are 26 letters in the English alphabet.

            count += Math.min(clockwise, counterClockwise);

            // Update the current position to the target character
            current = target;
        }

        System.out.println(count);
    }
}
