import java.util.Scanner;

public class ID_1154A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();

        // a+b, a+c, b+c, a+b+c
        // a+b+c - a+b = c
        // a+b+c - a+c = b
        // a+b+c - b+c = a

        // a+b+c
        int max = Math.max(Math.max(Math.max(n1, n2), n3), n4);

        if (max == n1) {
            int c = max - n4;
            int b = max - n2;
            int a = max - n3;

            System.out.println(c + " " + b + " " + a);

        } else if (max == n2) {

            int c = max - n1;
            int b = max - n4;
            int a = max - n3;

            System.out.println(c + " " + b + " " + a);

        } else if (max == n3) {

            int c = max - n1;
            int b = max - n2;
            int a = max - n4;

            System.out.println(c + " " + b + " " + a);

        } else if (max == n4) {

            int c = max - n1;
            int b = max - n2;
            int a = max - n3;

            System.out.println(c + " " + b + " " + a);

        }

    }
}
