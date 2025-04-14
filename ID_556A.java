import java.util.Scanner;

public class ID_556A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine();
        String given = input.nextLine();

        System.out.println(processString(given));

        input.close();
    }

    public static int processString(String original) {
        int zeros = 0;
        int ones = 0;

        // Count the number of zeros and ones
        for (char c : original.toCharArray()) {
            if (c == '0') zeros++;
            else ones++;
        }
        return Math.abs(zeros - ones);
    }
}