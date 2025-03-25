import java.util.Scanner;

public class ID_1472A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int w = input.nextInt();
            int h = input.nextInt();
            int n = input.nextInt();
            int count = 1;

            while (w % 2 == 0) {
                w /= 2;
                count *= 2;
            }

            while (h % 2 == 0) {
                h /= 2;
                count *= 2;
            }

            if (count >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}