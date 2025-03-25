import java.util.Scanner;

public class ID_112A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String line1 = input.nextLine().toLowerCase();
        String line2 = input.nextLine().toLowerCase();

        if (line1.compareTo(line2) == 0) {
            System.out.println(0);
        } else if (line1.compareTo(line2) > 0) {
            System.out.println(1);
        } else if (line1.compareTo(line2) < 0) {
            System.out.println(-1);
        }

    }

}
