import java.util.Arrays;
import java.util.Scanner;

public class ID_1829B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int numElements = input.nextInt();
            input.nextLine();
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = 0;
            int count = 0;

            for (int j = 0; j < numElements; j++) {
                if (arr[j] == 0) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }

            System.out.println(max);

        }
    }
}
