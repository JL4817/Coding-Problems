import java.util.Scanner;

public class ID_1579A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nTest; i++) {
            String str = input.nextLine();
            int countA = 0;
            int countB = 0;
            int countC = 0;

            for (char character : str.toCharArray()) {
                if (character == 'A') {
                    countA++;
                } else if (character == 'B') {
                    countB++;
                } else if (character == 'C') {
                    countC++;
                }
            }

            /*
             * To determine if the string can be fully erased, the number of 'B's should be
             * equal to the sum of 'A's and 'C's. This is because each action involves
             * removing one 'B' along with one 'A' or one 'C'.
             */

            if (countB == countA + countC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        input.close();
    }
}
