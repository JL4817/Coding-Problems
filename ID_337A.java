import java.util.Arrays;
import java.util.Scanner;

public class ID_337A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudnets = input.nextInt();
        int puzzlesNum = input.nextInt();
        input.nextLine();
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= puzzlesNum - numStudnets; i++) {
            minDiff = Math.min(minDiff, arr[i + numStudnets - 1] - arr[i]);
        }

        System.out.println(minDiff);
        input.close();
    }
}
