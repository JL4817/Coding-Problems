import java.util.Arrays;
import java.util.Scanner;

public class ID_1360B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTestCase = input.nextInt();

        for (int i = 0; i < numTestCase; i++) {
            int numElements = input.nextInt();
            input.nextLine();
            int[] arrElements = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arrElements);

            int minDiff = Integer.MAX_VALUE;

            for (int j = 0; j < numElements - 1; j++) {
                if (Math.abs(arrElements[j] - arrElements[j + 1]) < minDiff) {
                    minDiff = Math.abs(arrElements[j] - arrElements[j + 1]);
                }
            }
            System.out.println(minDiff);
        }
    }

}
