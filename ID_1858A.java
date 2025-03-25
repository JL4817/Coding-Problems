import java.util.Scanner;

public class ID_1858A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (c % 2 == 0) {
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (b > a) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
        input.close();
    }
}