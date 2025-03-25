import java.util.Arrays;
import java.util.Scanner;

public class ID_1941A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for (int n = 0; n < nTest; n++) {
            int numLeftSide = input.nextInt();
            int numRightSide = input.nextInt();
            int maximumSum = input.nextInt();
            input.nextLine();
            int[] leftPocket = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] rightPocket = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;

            for (int i = 0; i < numLeftSide; i++) {
                for (int j = 0; j < numRightSide; j++) {
                    if ((leftPocket[i] + rightPocket[j]) <= maximumSum) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}