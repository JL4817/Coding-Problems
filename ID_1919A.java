import java.util.Scanner;

public class ID_1919A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numT = input.nextInt();

        for (int i = 0; i < numT; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            if ((a + b) % 2 == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }

        }
    }
}
