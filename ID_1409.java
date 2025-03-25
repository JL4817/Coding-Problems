import java.util.Scanner;

public class ID_1409 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int numOfTestcase = input.nextInt();

        for (int i = 0; i < numOfTestcase; i++) {
            int a = input.nextInt();
            int toBe = input.nextInt();
            int count = 0;

            if (a == toBe) {
                System.out.println(0);
                continue;
            }

            int difference = Math.abs(toBe - a);
            System.out.println((difference + 9) / 10);

        }

        input.close();

    }
}