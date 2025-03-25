import java.util.Scanner;

public class ID_1807A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();

        input.nextLine();

        for (int i = 0; i < nrOfTest; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a + b == c) {
                System.out.println("+");
            } else if (a - b == c) {
                System.out.println("-");
            }
        }
    }
}
