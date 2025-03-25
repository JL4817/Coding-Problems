import java.util.Scanner;

public class ID_327A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numElements = input.nextInt();
        int originalCountOne = 0;
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;
        int[] arr = new int[numElements];

        if (numElements == 1) {
            int singleElement = input.nextInt();
            System.out.println(singleElement == 1 ? 0 : 1);
            return;
        }

        for (int n = 0; n < numElements; n++) {
            arr[n] = input.nextInt();
            if (arr[n] == 1) {
                originalCountOne++;
            }
        }

        for (int i = 0; i < numElements; i++) {
            int value = (arr[i] == 1) ? -1 : 1;
            diff = Math.max(value, diff + value);
            maxDiff = Math.max(maxDiff, diff);
        }

        int maxOnes = originalCountOne + maxDiff;
        System.out.println(maxOnes);

        input.close();
    }
}
// https://chatgpt.com/c/679de63e-4d24-8006-8a0e-7c01a4eda251