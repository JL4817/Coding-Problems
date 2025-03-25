import java.util.ArrayList;
import java.util.Scanner;

public class ID_486A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        if (n % 2 == 0) {
            System.out.println(n / 2);
        }

        if (n % 2 != 0) {
            System.out.println(-((n + 1) / 2));
        }

    }

}
