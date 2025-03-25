import java.util.ArrayList;
import java.util.Scanner;

public class ID_1343B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();
        // input.nextLine();

        for (int i = 0; i < nrOfTestCase; i++) {
            int nrOfOddAndEven = input.nextInt();

            // trying to see if the array can made made, if odd not possible
            if ((nrOfOddAndEven / 2) % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

                ArrayList<Integer> odd = new ArrayList<>();
                ArrayList<Integer> even = new ArrayList<>();

                for (int j = 1; j <= nrOfOddAndEven / 2; j++) {
                    even.add(j * 2);
                }

                for (int j = 1; j < nrOfOddAndEven / 2; j++) {
                    odd.add(j * 2 - 1);
                }

                odd.add(nrOfOddAndEven / 2 * 2 - 1 + nrOfOddAndEven / 2);

                for (int num : even) {
                    System.out.print(num + " ");
                }
                for (int num : odd) {
                    System.out.print(num + " ");
                }

                System.out.println();

            }
        }
        input.close();
    }
}
