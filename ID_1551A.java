import java.util.Scanner;

public class ID_1551A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int num = input.nextInt();

            // number of 2-burle coins
            int c2 = num / 3;

            int remainder = num % 3;
            if (remainder == 1) {
                // one more 1-burle coin
                System.out.println((c2 + 1) + " " + c2);
            } else if (remainder == 2) {
                // one more 2-burle coin
                System.out.println(c2 + " " + (c2 + 1));
            } else {
                // no adjustment needed
                System.out.println(c2 + " " + c2);
            }
        }
    }
}
