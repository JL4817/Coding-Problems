import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ID_1353B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTestCase = input.nextInt();

        for (int i = 0; i < numTestCase; i++) {
            int arrayLength = input.nextInt();
            int numOfSwapsPossible = input.nextInt();
            input.nextLine();
            String[] arr1 = input.nextLine().split(" ");
            String[] arr2 = input.nextLine().split(" ");

            int[] intArr1 = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();
            int[] intArr2 = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(intArr1); // ascending
            Arrays.sort(intArr2); // ascneding
            reverseArray(intArr2); // reverse method for descending order

            for (int j = 0; j < numOfSwapsPossible && j < arrayLength; j++) {
                if (intArr1[j] < intArr2[j]) {
                    int temp = intArr1[j];
                    intArr1[j] = intArr2[j];
                    intArr2[j] = temp;
                }
            }
            int sum = 0;
            for (int num : intArr1) {
                sum += num;
            }
            System.out.println(sum);
        }
        input.close();
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
