import java.util.Scanner;

public class ID_1360A {
    public static void main(String arhgs[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            double h, v, sR, nR = 0;

            // side by side horizontal
            h = (Math.max(2 * a, b));
            // vertical
            v = (Math.max(a, 2 * b));
            // stacked rotated
            sR = Math.max(a + b, Math.max(a, b));
            // stacked without rotated
            nR = Math.max(a + b, Math.max(a, b));
            // Output the minimum area
            System.out.println(
                    (int) (Math.min(Math.min(h, v), Math.min(sR, nR)) * Math.min(Math.min(h, v), Math.min(sR, nR))));
        }
        input.close();

        // https://chatgpt.com/c/675edde6-cec8-8006-9e6c-e774803cb255
    }
}
