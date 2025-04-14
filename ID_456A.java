import java.util.Scanner;

public class ID_456A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean price = false;
        boolean quality = false;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a > b) {
                price = true;
            }
            if (b > a) {
                quality = true;
            }

            if (price && quality) {
                break;
            }
        }

        if (price && quality) {
            System.out.println("Happy Alex");
        } else {
            System.out.println("Poor Alex");
        }
        input.close();
    }
}
