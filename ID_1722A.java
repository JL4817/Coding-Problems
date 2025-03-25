import java.util.Arrays;
import java.util.Scanner;

public class ID_1722A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nrOfTests = input.nextInt();
        input.nextLine();

        String correctSpelling = "Timur";
        char[] correctArray = correctSpelling.toCharArray();
        Arrays.sort(correctArray);

        while (nrOfTests-- > 0) {
            int n = input.nextInt();
            input.nextLine();
            String str = input.nextLine();

            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            char[] sArray = str.toCharArray();
            Arrays.sort(sArray);

            if (Arrays.equals(sArray, correctArray)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        input.close();
    }
}
