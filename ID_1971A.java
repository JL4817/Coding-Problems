import java.util.Scanner;

public class ID_1971A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();
        for (int i = 0; i < numTest; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);

            System.out.println(min + " " + max);
        }
    }
}
