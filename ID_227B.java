import java.util.Scanner;

public class ID_227B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        int c4 = scanner.nextInt();
        int c5 = scanner.nextInt();
        scanner.close();
        int total = c1 + c2 + c3 + c4 + c5;

        if (total % 5 != 0) {
            System.out.println("-1");
            return;
        }

        int b = total / 5;

        if (b <= 0) {
            System.out.println("-1");
            return;
        }
        System.out.println(b);
    }
}