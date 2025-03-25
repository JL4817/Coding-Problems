import java.util.Scanner;

public class ID_1977A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = input.nextInt();
            int m = input.nextInt();

            if (m <= n && (n - m) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
