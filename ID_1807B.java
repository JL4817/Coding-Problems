import java.util.Scanner;

public class ID_1807B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nrTestCase = scanner.nextInt();

        for (int i = 0; i < nrTestCase; i++) {

            int nrBag = scanner.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < nrBag; j++) {
                int num = scanner.nextInt();

                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }

            if (evenSum > oddSum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}
