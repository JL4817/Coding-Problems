import java.util.Scanner;

public class ID_1521A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();

            if (b == 1) {
                // If B=1, we can't differentiate between good and nearly good
                System.out.println("NO");
            } else {
                // x = A*B (good number)
                // y = A (nearly good)
                // z = A*(B+1) (nearly good)
                System.out.println("YES");
                System.out.println(a + " " + (a * b) + " " + (a * (b + 1)));
            }
        }
        input.close();
    }
}