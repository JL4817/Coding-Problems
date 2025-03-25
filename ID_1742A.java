import java.util.Scanner;

public class ID_1742A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();

        for (int i = 0; i < nr; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a + b == c) {
                System.out.println("YES");
            } else if (b + c == a) {
                System.out.println("YES");
            } else if (a + c == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
