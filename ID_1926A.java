import java.util.HashMap;
import java.util.Scanner;

public class ID_1926A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numTest; i++) {
            String[] str = input.nextLine().split("");

            int countA = 0;
            int countB = 0;

            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("A")) {
                    countA++;
                } else {
                    countB++;
                }
            }

            System.out.println(countA > countB ? "A" : "B");

        }
        input.close();
    }
}
