
import java.util.Scanner;

public class ID_1537A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int t = 0; t < nTest; t++) {
            int n = input.nextInt();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += input.nextInt();
            }

            if (sum == n) {
                // Mean is already 1
                System.out.println(0);
            } else if (sum > n) {
                // Need to add (sum - n) zeros
                System.out.println(sum - n);
            } else if (sum < n) {
                // Need to add 1 number to make mean = 1
                System.out.println(1);
            }
        }
    }
}
