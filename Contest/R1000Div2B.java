package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class R1000Div2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int n = 0; n < nTest; n++) {
            int numElements = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();
            input.nextLine();
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            l -= 1;
            r -= 1;

            int sumSub = 0;
            for (int i = l; i <= r; i++) {
                sumSub += arr[i];
            }

            int minSum = sumSub;

            for (int i = 0; i < l; i++) {
                for (int j = r + 1; j < arr.length; j++) {
                    int[] tempArr = arr.clone();

                    int temp = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = temp;

                    int newSum = 0;
                    for (int k = l; k <= r; k++) {
                        newSum += tempArr[k];
                    }

                    minSum = Math.min(minSum, newSum);
                }
            }

            System.out.println(minSum);
        }

        input.close();
    }
}
