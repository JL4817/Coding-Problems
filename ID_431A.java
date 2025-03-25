import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ID_431A {
    public static void main(String[] args) {
        // vermutlich gibt es lücken
        Scanner input = new Scanner(System.in);

        int val1 = input.nextInt();
        int val2 = input.nextInt();
        int val3 = input.nextInt();
        int val4 = input.nextInt();

        int[] arrVal = { val1, val2, val3, val4 };

        input.nextLine();
        String theGame[] = input.nextLine().split("");
        int theGaemIntArr[] = Arrays.stream(theGame).mapToInt(Integer::parseInt).toArray();
        int total = 0;

        for (int i = 0; i < theGame.length; i++) {
            if (theGaemIntArr[i] == 1) {
                total += val1;
            }

            if (theGaemIntArr[i] == 2) {
                total += val2;
            }
            if (theGaemIntArr[i] == 3) {
                total += val3;
            }

            if (theGaemIntArr[i] == 4) {
                total += val4;
            }
        }

        System.out.println(total);

    }
}
