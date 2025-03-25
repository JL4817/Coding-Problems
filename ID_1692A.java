import java.util.Scanner;

public class ID_1692A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        for (int i = 0; i < nrOfTestCase; i++) {

            int count = 0;

            int you = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            if (b > you) {
                count++;
            }

            if (c > you) {
                count++;
            }

            if (d > you) {
                count++;
            }

            System.out.println(count);
        }

    }

}