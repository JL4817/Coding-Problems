import java.util.Arrays;
import java.util.Scanner;

public class ID_1676B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTestcase = input.nextInt();

        for (int i = 0; i < numTestcase; i++) {
            int numElements = input.nextInt();

            int arr[] = new int[numElements];
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < numElements; j++) {
                int element = input.nextInt();
                arr[j] = element;

                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            int totalCount = 0;

            for (int candy : arr) {
                totalCount += (Math.abs(candy - min));
            }

            System.out.println(totalCount);

        }
        input.close();
    }
}
