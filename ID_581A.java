import java.util.Scanner;

public class ID_581A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int red = input.nextInt();
        int blue = input.nextInt();
        // int red = 3;
        // int blue = 1;

        int totalFashion = 0;

        int minDaysDiff = Math.min(red, blue);
        totalFashion = totalFashion + minDaysDiff;

        int redNew = red - minDaysDiff;
        int blueNew = blue - minDaysDiff;
        int totalMatch = (redNew / 2) + (blueNew / 2);

        System.out.println(totalFashion + " " + totalMatch);

    }
}
