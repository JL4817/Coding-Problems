import java.util.Scanner;

public class ID_514A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] number = input.nextLine().split("");
        int[] copyArr = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            int original = Integer.parseInt(number[i]);
            int after = 9 - original;

            if (i == 0 && after == 0) {
                // do not let the first digit to become 0
                copyArr[i] = original;
            } else if (original > after) {
                copyArr[i] = after;
            } else {
                copyArr[i] = original;
            }
        }

        for (int n : copyArr) {
            System.out.print(n);
        }
        input.close();
    }
}
