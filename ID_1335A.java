import java.util.Scanner;

public class ID_1335A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrTestCase = input.nextInt();

        for (int i = 0; i < nrTestCase; i++) {
            int nr = input.nextInt();

            if (nr <= 2) {
                System.out.println(0);
            } else if (nr % 2 == 0) {
                int ways = (nr / 2) - 1;
                System.out.println(ways);
            } else {
                int ways = (nr / 2);
                System.out.println(ways);
            }
        }

        input.close();
    }
}
