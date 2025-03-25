package Contest.R1001;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();
        for (int n = 0; n < nTest; n++) {
            String line = input.nextLine();

            if (!line.contains("1")) {
                System.out.println(0);
            } else {
                System.out.println(calculate(line));
            }
        }
        input.close();
    }

    private static int calculate(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }

}
