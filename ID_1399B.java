import java.util.Arrays;
import java.util.Scanner;

public class ID_1399B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int numElements = input.nextInt();
            input.nextLine();
            int[] arr1 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int min1 = Arrays.stream(arr1).min().getAsInt();
            int min2 = Arrays.stream(arr2).min().getAsInt();

            long count = 0;

            for (int j = 0; j < numElements; j++) {
                long excessCandies = arr1[j] - min1;
                long excessOranges = arr2[j] - min2;

                long simultaneousMoves = Math.min(excessCandies, excessOranges);

                count += simultaneousMoves + (excessCandies - simultaneousMoves) + (excessOranges - simultaneousMoves);

            }

            System.out.println(count);

        }
        input.close();
    }
}
