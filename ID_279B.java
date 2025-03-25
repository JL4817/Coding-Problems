import java.util.Arrays;
import java.util.Scanner;

public class ID_279B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int count = 0;
        input.nextLine();
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

        }

    }
}
