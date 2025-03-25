import java.util.Scanner;

public class ID_148A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int dragonsNr = input.nextInt();

        int count = 0;
        // if remainder is == 0 it means that they it that turn
        for (int i = 1; i <= dragonsNr; i++) {
            if (i % a == 0 || i % b == 0 || i % c == 0 || i % d == 0) {
                count++;
            }
        }

        System.out.println(count);

    }

}
