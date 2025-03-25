import java.util.Arrays;
import java.util.Scanner;

public class ID_1325B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            int count = 1; // Start with 1 because the first element is always counted
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
