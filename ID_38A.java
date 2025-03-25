import java.util.Arrays;
import java.util.Scanner;

public class ID_38A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[] yearArr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = input.nextInt();
        int b = input.nextInt();
        int total = 0;
        for (int i = a - 1; i < b - 1; i++) {
            total += yearArr[i];
        }

        System.out.println(total);
        input.close();
    }
}
