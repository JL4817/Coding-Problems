import java.util.Scanner;

public class ID_1915C {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int length = input.nextInt();
            long total = 0;

            for (int j = 0; j < length; j++) {
                total += input.nextLong();
            }

            long sqrt = (long) Math.sqrt(total);

            if (total == sqrt * sqrt) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
