import java.util.Scanner;

public class ID_1374A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        for (int i = 0; i < nrOfTestCase; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();

            int m = (n - y) / x;

            int k = x * m + y;

            System.out.println(k);

        }

    }
}
