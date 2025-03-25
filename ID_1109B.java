import java.util.Scanner;

public class ID_1109B {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        // String s = "abcDcba";
        int length = s.length();

        if (!(length % 2 == 0)) { // if not even

            String first = s.substring(0, length / 2);
            String last = s.substring((length / 2) + 1, length);

            if (first.equals(last)) {
                System.out.println("Impossible");
            }

            // String middle = s.substring(length / 2, (length / 2) + 1);

            System.out.println(2);

        } else if (length % 2 == 0) { // when its even

            // abba

            String first = s.substring(0, length / 2);
            String last = s.substring((length / 2), length);

            if (first.equals(last)) {
                System.out.println("Impossible");
            }

            System.out.println(1);

        }

    }

}
