import java.util.Arrays;
import java.util.Scanner;

public class ID_580A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nElements = input.nextInt();
        input.nextLine();

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 1;
        int maxCount = 1;

        for (int j = 1; j < nElements; j++) {
            if (arr[j] >= arr[j - 1]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }

        }
        System.out.println(maxCount);

        input.close();

    }
}
/*
 * If we start at j=0 then:
 * The comparison arr[j] >= arr[j - 1] would try to access arr[-1] on the first
 * iteration, which is invalid and causes an "index out of bounds" error.
 * so starts at j=1
 */
