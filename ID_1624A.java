import java.util.ArrayList;
import java.util.Scanner;

public class ID_1624A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int nrElements = input.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < nrElements; j++) {
                int currNum = input.nextInt();

                if (currNum > max) {
                    max = currNum;
                }

                if (currNum < min) {
                    min = currNum;
                }
            }

            System.out.println(max - min);

        }
        input.close();
    }
}
