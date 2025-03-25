import java.util.Scanner;

public class ID_2009A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            int c = (a + b) / 2;

            if (a == b) {
                System.out.println(0);
            } else {
                System.out.println((c - a) + (b - c));
            }
        }
    }
}
