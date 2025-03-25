import java.util.Scanner;

public class ID_1996A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int n = input.nextInt();
            int count = 0;

            while (true) {
                if (n >= 4) {
                    n -= 4;
                    count++;
                } else if (n >= 2) {
                    n -= 2;
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
