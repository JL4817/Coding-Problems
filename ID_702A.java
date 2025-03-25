import java.util.Arrays;
import java.util.Scanner;

public class ID_702A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numElements = input.nextInt();
        int[] arr = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            arr[i] = input.nextInt();
        }

        int maxCount = 1;
        int currentCount = 1;
        // The comparison arr[i] > arr[i - 1] correctly identifies when the array is
        // increasing.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}
