import java.util.Arrays;
import java.util.Scanner;

public class ID_1399 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();

        for (int i = 0; i < nrOfTest; i++) {

            int numLength = input.nextInt();
            int[] numbers = new int[numLength];

            // Read numbers into the array
            for (int j = 0; j < numLength; j++) {
                numbers[j] = input.nextInt();
            }

            Arrays.sort(numbers);
            boolean possible = true;

            // need to compare values that came before, so not starting from 0 but 1
            for (int p = 1; p < numbers.length; p++) {
                if (numbers[p] - numbers[p - 1] > 1) {
                    possible = false;
                    break;
                }

            }

            if (possible == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        input.close();

    }

}
