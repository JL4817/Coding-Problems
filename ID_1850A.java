import java.util.Scanner;

public class ID_1850A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        input.nextLine();
        for (int i = 0; i < nrOfTestCase; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int max = Math.max(Math.max(a, b), c);

            if (max == a && (max + b >= 10 || max + c >= 10)) {
                System.out.println("YES");
            } else if (max == b && (max + a >= 10 || max + c >= 10)) {
                System.out.println("YES");
            } else if (max == c && (max + a >= 10 || max + b >= 10)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
