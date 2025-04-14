import java.util.Scanner;

public class ID_1463A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int totalShots = a + b + c - 2;

            System.out.println(totalShots % 7 == 0 ? "YES" : "NO");
        }

        input.close();
    }
}